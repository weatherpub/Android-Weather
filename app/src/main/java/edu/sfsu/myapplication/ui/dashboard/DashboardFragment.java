package edu.sfsu.myapplication.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import edu.sfsu.myapplication.R;
import edu.sfsu.myapplication.adapter.RecyclerViewAdapter;
import edu.sfsu.myapplication.databinding.FragmentDashboardBinding;
import edu.sfsu.myapplication.databinding.FragmentHomeBinding;
import edu.sfsu.myapplication.model.MenuModel;
import edu.sfsu.myapplication.ui.home.HomeViewModel;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public ArrayList<MenuModel> menuModel;
    public RecyclerView recyclerView;

    public DashboardFragment() {
        menuModel = new ArrayList<>();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        menuModel.add(new MenuModel("Current", "Forecast", "History", "Marine", "Sports"));

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView = view.findViewById(R.id.rv_dashboard);

        for(int i = 0; i < menuModel.size(); i++) {
            Log.v("LOG", "-> " + menuModel.get(i).getCurrent());
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(menuModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

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