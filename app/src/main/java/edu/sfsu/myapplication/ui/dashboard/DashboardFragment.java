package edu.sfsu.myapplication.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.sfsu.myapplication.MainActivity;
import edu.sfsu.myapplication.R;
import edu.sfsu.myapplication.adapter.RecyclerViewAdapter;
import edu.sfsu.myapplication.databinding.FragmentDashboardBinding;
import edu.sfsu.myapplication.model.MenuModel;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public ArrayList<MenuModel> menuModel;
    // CurrentWeather menuModel;
    public RecyclerView recyclerView;

    public DashboardFragment() {
        menuModel = new ArrayList<>();
        // menuModel = CurrentWeather.getInstance();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        menuModel.add(new MenuModel("Current", "Forecast", "History", "Marine", "Sports"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(menuModel);

        recyclerView = view.findViewById(R.id.rv_dashboard);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // open MainActivity from here
        adapter.setListener(new RecyclerViewAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Log.i("LOG", "inside of setListener()");
                Intent intent = new Intent(getActivity(), MainActivity.class);
                requireActivity().startActivity(intent);
            }
        });

        DashboardViewModel dashboardViewModel1 = new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}