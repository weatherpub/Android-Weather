package edu.sfsu.myapplication.ui.home;

import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import edu.sfsu.myapplication.model.CurrentModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<CurrentModel>> data;

    ArrayList<CurrentModel> cm;

    public HomeViewModel() {
        data = new MutableLiveData<>();
        cm = new ArrayList<>();

        new ViewModelAsyncTask().execute("https://api.weatherapi.com/v1/current.json?key=224a659c7414460899d10356232501&q=berkeley&aqi=no");
    }

    public LiveData<ArrayList<CurrentModel>> getWeatherData() {
        return data;
    }

    public class ViewModelAsyncTask extends AsyncTask<String, Void, String> {
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
        protected void onPostExecute(String result) { // onPostExecute - runs on the main thread.
            super.onPostExecute(result);
            try {
                JSONObject obj = new JSONObject(result);

                cm.add(new CurrentModel(
                        obj.getJSONObject("location").getString("name"),
                        obj.getJSONObject("location").getString("region"),
                        obj.getJSONObject("location").getString("country"),
                        obj.getJSONObject("location").getInt("lat"),
                        obj.getJSONObject("location").getInt("lon"),
                        obj.getJSONObject("location").getString("tz_id"),
                        obj.getJSONObject("location").getInt("localtime_epoch"),
                        obj.getJSONObject("location").getString("localtime"),
                        obj.getJSONObject("current").getInt("last_updated_epoch"),
                        obj.getJSONObject("current").getString("last_updated"),
                        obj.getJSONObject("current").getInt("temp_c"),
                        obj.getJSONObject("current").getInt("temp_f"),
                        obj.getJSONObject("current").getInt("is_day"),
                        obj.getJSONObject("current").getJSONObject("condition").getString("text"),
                        obj.getJSONObject("current").getJSONObject("condition").getString("icon"),
                        obj.getJSONObject("current").getJSONObject("condition").getInt("code"),
                        obj.getJSONObject("current").getInt("wind_mph"),
                        obj.getJSONObject("current").getInt("wind_kph"),
                        obj.getJSONObject("current").getInt("wind_degree"),
                        obj.getJSONObject("current").getString("wind_dir"),
                        obj.getJSONObject("current").getInt("pressure_mb"),
                        obj.getJSONObject("current").getInt("pressure_in"),
                        obj.getJSONObject("current").getInt("precip_mm"),
                        obj.getJSONObject("current").getInt("precip_in"),
                        obj.getJSONObject("current").getInt("humidity"),
                        obj.getJSONObject("current").getInt("cloud"),
                        obj.getJSONObject("current").getInt("feelslike_c"),
                        obj.getJSONObject("current").getInt("feelslike_f"),
                        obj.getJSONObject("current").getInt("windchill_c"),
                        obj.getJSONObject("current").getInt("windchill_f"),
                        obj.getJSONObject("current").getInt("heatindex_c"),
                        obj.getJSONObject("current").getInt("heatindex_f"),
                        obj.getJSONObject("current").getInt("dewpoint_c"),
                        obj.getJSONObject("current").getInt("dewpoint_f"),
                        obj.getJSONObject("current").getInt("vis_km"),
                        obj.getJSONObject("current").getInt("vis_miles"),
                        obj.getJSONObject("current").getInt("uv"),
                        obj.getJSONObject("current").getInt("gust_mph"),
                        obj.getJSONObject("current").getInt("gust_kph")));

                data.setValue(cm);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}