package edu.sfsu.myapplication.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import kotlinx.coroutines.CoroutineScope;

public class CurrentModel {
    // location
    private final String name;
    private final String region;
    private final String country;
    private final double lat;
    private final double lon;
    private final String tz_id;
    private final int localtime_epoch;
    private final String localtime;
    // current
    private final int last_updated_epoch;
    private final String last_updated;
    private final int temp_c;
    private final int temp_f;
    private final int is_day;
    // condition
    private final String text;
    private final String icon;
    private final int code;
    // current
    private final int wind_mph;
    private final int wind_kph;
    private final int wind_degree;
    private final String wind_dir;
    private final int pressure_mb;
    private final int pressure_in;
    private final int precip_mm;
    private final int precip_in;
    private final int humidity;
    private final int cloud;
    private final int feelslike_c;
    private final int feelslike_f;
    private final int windchill_c;
    private final int windchill_f;
    private final int heatindex_c;
    private final int heatindex_f;
    private final int dewpoint_c;
    private final int dewpoint_f;
    private final int vis_km;
    private final int vis_miles;
    private final int uv;
    private final int gust_mph;
    private final int gust_kph;

    public CurrentModel(String name, String region, String country, double lat, double lon, String tz_id, int localtime_epoch, String localtime, int last_updated_epoch, String last_updated, int temp_c, int temp_f, int is_day, String text, String icon, int code, int wind_mph, int wind_kph, int wind_degree, String wind_dir, int pressure_mb, int pressure_in, int precip_mm, int precip_in, int humidity, int cloud, int feelslike_c, int feelslike_f, int windchill_c, int windchill_f, int heatindex_c, int heatindex_f, int dewpoint_c, int dewpoint_f, int vis_km, int vis_miles, int uv, int gust_mph, int gust_kph) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.tz_id = tz_id;
        this.localtime_epoch = localtime_epoch;
        this.localtime = localtime;
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.is_day = is_day;
        this.text = text;
        this.icon = icon;
        this.code = code;
        this.wind_mph = wind_mph;
        this.wind_kph = wind_kph;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure_mb = pressure_mb;
        this.pressure_in = pressure_in;
        this.precip_mm = precip_mm;
        this.precip_in = precip_in;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.uv = uv;
        this.gust_mph = gust_mph;
        this.gust_kph = gust_kph;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTz_id() {
        return tz_id;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public int getTemp_f() {
        return temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public int getCode() {
        return code;
    }

    public int getWind_mph() {
        return wind_mph;
    }

    public int getWind_kph() {
        return wind_kph;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public int getPressure_in() {
        return pressure_in;
    }

    public int getPrecip_mm() {
        return precip_mm;
    }

    public int getPrecip_in() {
        return precip_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public int getFeelslike_c() {
        return feelslike_c;
    }

    public int getFeelslike_f() {
        return feelslike_f;
    }

    public int getWindchill_c() {
        return windchill_c;
    }

    public int getWindchill_f() {
        return windchill_f;
    }

    public int getHeatindex_c() {
        return heatindex_c;
    }

    public int getHeatindex_f() {
        return heatindex_f;
    }

    public int getDewpoint_c() {
        return dewpoint_c;
    }

    public int getDewpoint_f() {
        return dewpoint_f;
    }

    public int getVis_km() {
        return vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public int getUv() {
        return uv;
    }

    public int getGust_mph() {
        return gust_mph;
    }

    public int getGust_kph() {
        return gust_kph;
    }
}