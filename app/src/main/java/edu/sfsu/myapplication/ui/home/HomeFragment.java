package edu.sfsu.myapplication.ui.home;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import java.io.IOException;

import edu.sfsu.myapplication.databinding.FragmentHomeBinding;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView country = binding.tvCountry;
        final TextView name = binding.tvName;
        final TextView region = binding.tvRegion;
        final TextView lat = binding.tvLat;
        final TextView lon = binding.tvLon;

        homeViewModel.getWeatherData().observe(getViewLifecycleOwner(), data -> {
            country.setText(data.get(0).getCountry());
            name.setText(data.get(0).getName());
            region.setText(data.get(0).getRegion());
            lat.setText(String.valueOf(data.get(0).getLat()));
            lon.setText(String.valueOf(data.get(0).getLon()));

        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public class AsyncTaskHomeFragment extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.v("LOG", "onPreExecute() -> Running ");
        }

        @Override
        protected String doInBackground(String... param) {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder().url(param[0]).build();

            try {
                Response response = client.newCall(request).execute();

                if(!response.isSuccessful())
                    return null;

                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {

        }
    }
}