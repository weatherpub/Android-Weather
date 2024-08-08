package edu.sfsu.myapplication.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.squareup.picasso.Picasso;

import edu.sfsu.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView name = binding.tvName;
        final TextView region = binding.tvRegion;
        final TextView country = binding.tvCountry;
        final TextView lat = binding.tvLat;
        final TextView lon = binding.tvLon;
        final TextView tz_id = binding.tvTzId;
        final TextView localtime_epoch = binding.tvLocaltimeEpoch;
        final TextView localtime = binding.tvLocaltime;
        final TextView last_updated_epoch = binding.tvLastUpdatedEpoch;
        final TextView last_updated = binding.tvLastUpdated;
        final TextView temp_c = binding.tvTempC;
        final TextView temp_f = binding.tvTempF;
        final TextView is_day = binding.tvIsDay;
        final TextView text = binding.tvText;
        final ImageView icon = binding.tvIcon;
        final TextView code = binding.tvCode;
        final TextView wind_mph = binding.tvWindMph;
        final TextView wind_kph = binding.tvWindKph;
        final TextView wind_degree = binding.tvWindDegree;
        final TextView wind_dir = binding.tvWindDir;
        final TextView pressure_mb = binding.tvPressureMb;
        final TextView pressure_in = binding.tvPressureIn;
        final TextView precip_mm = binding.tvPrecipMm;
        final TextView precip_in = binding.tvPrecipIn;
        final TextView humidity = binding.tvHumidity;
        final TextView cloud = binding.tvCloud;
        final TextView feelslike_c = binding.tvFeelslikeC;
        final TextView feelslike_f = binding.tvFeelslikeF;
        final TextView windchill_c = binding.tvWindchillC;
        final TextView windchill_f = binding.tvWindchillF;
        final TextView heatindex_c = binding.tvHeatindexC;
        final TextView heatindex_f = binding.tvHeatindexF;
        final TextView dewpoint_c = binding.tvDewpointC;
        final TextView dewpoint_f = binding.tvDewpointF;
        final TextView vis_km = binding.tvVisKm;
        final TextView vis_miles = binding.tvVisMiles;
        final TextView uv = binding.tvUv;
        final TextView gust_mph = binding.tvGustMph;
        final TextView gust_kph = binding.tvGustKph;

        homeViewModel.getWeatherData().observe(getViewLifecycleOwner(), data -> {
            country.setText(data.get(0).getCountry());
            name.setText(data.get(0).getName());
            region.setText(data.get(0).getRegion());
            lat.setText(String.valueOf(data.get(0).getLat()));
            lon.setText(String.valueOf(data.get(0).getLon()));
            tz_id.setText(String.valueOf(data.get(0).getTz_id()));
            localtime_epoch.setText(String.valueOf(data.get(0).getLocaltime_epoch()));
            localtime.setText(String.valueOf(data.get(0).getLocaltime()));
            last_updated_epoch.setText(String.valueOf(data.get(0).getLast_updated_epoch()));
            last_updated.setText(String.valueOf(data.get(0).getLast_updated()));
            temp_c.setText(String.valueOf(data.get(0).getTemp_c()));

            temp_f.setText(String.valueOf(data.get(0).getTemp_f()));
            // icon
            Picasso.get().load(String.valueOf("https:" + data.get(0).getIcon())).into(icon);
            text.setText(String.valueOf(data.get(0).getText()));

            is_day.setText(String.valueOf(data.get(0).getIs_day()));
            code.setText(String.valueOf(data.get(0).getCode()));
            wind_mph.setText(String.valueOf(data.get(0).getWind_mph()));
            wind_kph.setText(String.valueOf(data.get(0).getWind_kph()));
            wind_degree.setText(String.valueOf(data.get(0).getWind_degree()));
            wind_dir.setText(data.get(0).getWind_dir());
            pressure_mb.setText(String.valueOf(data.get(0).getPressure_mb()));
            pressure_in.setText(String.valueOf(data.get(0).getPressure_in()));
            precip_mm.setText(String.valueOf(data.get(0).getPrecip_mm()));
            precip_in.setText(String.valueOf(data.get(0).getPrecip_in()));
            humidity.setText(String.valueOf(data.get(0).getHumidity()));
            cloud.setText(String.valueOf(data.get(0).getCloud()));
            feelslike_c.setText(String.valueOf(data.get(0).getFeelslike_c()));
            feelslike_f.setText(String.valueOf(data.get(0).getFeelslike_f()));
            windchill_c.setText(String.valueOf(data.get(0).getWindchill_c()));
            windchill_f.setText(String.valueOf(data.get(0).getWindchill_f()));
            heatindex_c.setText(String.valueOf(data.get(0).getHeatindex_c()));
            heatindex_f.setText(String.valueOf(data.get(0).getHeatindex_f()));
            dewpoint_c.setText(String.valueOf(data.get(0).getDewpoint_c()));
            dewpoint_f.setText(String.valueOf(data.get(0).getDewpoint_f()));
            vis_km.setText(String.valueOf(data.get(0).getVis_km()));
            vis_miles.setText(String.valueOf(data.get(0).getVis_miles()));
            uv.setText(String.valueOf(data.get(0).getUv()));
            gust_mph.setText(String.valueOf(data.get(0).getGust_mph()));
            gust_kph.setText(String.valueOf(data.get(0).getGust_kph()));
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}