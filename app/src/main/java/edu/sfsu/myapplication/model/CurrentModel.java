package edu.sfsu.myapplication.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import kotlinx.coroutines.CoroutineScope;

public class CurrentModel extends ViewModel {
    private final String name;
    private final String region;
    private final String country;
    private final int lat;
    private final int lon;
    private final String tz_id;
    private final int localtime_epoch;
    private final String localtime;
    private final int last_updated_epoch;
    private final String last_updated;
    private final int temp_c;
    private final int temp_f;
    private final int is_day;
    private final String text;
    private final String icon;
    private final int code;
    private final int wind_mph;
    private final int wind_kph;
    private final int wind_degree;
    private final int wind_dir;
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

    public CurrentModel(int cloud, int code, String country, int dewpoint_c, int dewpoint_f, int feelslike_c, int feelslike_f, int gust_kph, int gust_mph, int heatindex_c, int heatindex_f, int humidity, String icon, int is_day, String last_updated, int last_updated_epoch, int lat, String localtime, int localtime_epoch, int lon, String name, int precip_in, int precip_mm, int pressure_in, int pressure_mb, String region, int temp_c, int temp_f, String text, String tz_id, int uv, int vis_km, int vis_miles, int wind_degree, int wind_dir, int wind_kph, int wind_mph, int windchill_c, int windchill_f) {
        this.cloud = cloud;
        this.code = code;
        this.country = country;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.gust_kph = gust_kph;
        this.gust_mph = gust_mph;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.humidity = humidity;
        this.icon = icon;
        this.is_day = is_day;
        this.last_updated = last_updated;
        this.last_updated_epoch = last_updated_epoch;
        this.lat = lat;
        this.localtime = localtime;
        this.localtime_epoch = localtime_epoch;
        this.lon = lon;
        this.name = name;
        this.precip_in = precip_in;
        this.precip_mm = precip_mm;
        this.pressure_in = pressure_in;
        this.pressure_mb = pressure_mb;
        this.region = region;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.text = text;
        this.tz_id = tz_id;
        this.uv = uv;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.wind_kph = wind_kph;
        this.wind_mph = wind_mph;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
    }

    public CurrentModel(int cloud, int code, String country, int dewpoint_c, int dewpoint_f, int feelslike_c, int feelslike_f, int gust_kph, int gust_mph, int heatindex_c, int heatindex_f, int humidity, String icon, int is_day, String last_updated, int last_updated_epoch, int lat, String localtime, int localtime_epoch, int lon, String name, int precip_in, int precip_mm, int pressure_in, int pressure_mb, String region, int temp_c, int temp_f, String text, String tz_id, int uv, int vis_km, int vis_miles, int wind_degree, int wind_dir, int wind_kph, int wind_mph, int windchill_c, int windchill_f, @NonNull AutoCloseable... closeables) {
        super(closeables);
        this.cloud = cloud;
        this.code = code;
        this.country = country;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.gust_kph = gust_kph;
        this.gust_mph = gust_mph;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.humidity = humidity;
        this.icon = icon;
        this.is_day = is_day;
        this.last_updated = last_updated;
        this.last_updated_epoch = last_updated_epoch;
        this.lat = lat;
        this.localtime = localtime;
        this.localtime_epoch = localtime_epoch;
        this.lon = lon;
        this.name = name;
        this.precip_in = precip_in;
        this.precip_mm = precip_mm;
        this.pressure_in = pressure_in;
        this.pressure_mb = pressure_mb;
        this.region = region;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.text = text;
        this.tz_id = tz_id;
        this.uv = uv;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.wind_kph = wind_kph;
        this.wind_mph = wind_mph;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
    }

    public CurrentModel(@NonNull CoroutineScope viewModelScope, int cloud, int code, String country, int dewpoint_c, int dewpoint_f, int feelslike_c, int feelslike_f, int gust_kph, int gust_mph, int heatindex_c, int heatindex_f, int humidity, String icon, int is_day, String last_updated, int last_updated_epoch, int lat, String localtime, int localtime_epoch, int lon, String name, int precip_in, int precip_mm, int pressure_in, int pressure_mb, String region, int temp_c, int temp_f, String text, String tz_id, int uv, int vis_km, int vis_miles, int wind_degree, int wind_dir, int wind_kph, int wind_mph, int windchill_c, int windchill_f) {
        super(viewModelScope);
        this.cloud = cloud;
        this.code = code;
        this.country = country;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.gust_kph = gust_kph;
        this.gust_mph = gust_mph;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.humidity = humidity;
        this.icon = icon;
        this.is_day = is_day;
        this.last_updated = last_updated;
        this.last_updated_epoch = last_updated_epoch;
        this.lat = lat;
        this.localtime = localtime;
        this.localtime_epoch = localtime_epoch;
        this.lon = lon;
        this.name = name;
        this.precip_in = precip_in;
        this.precip_mm = precip_mm;
        this.pressure_in = pressure_in;
        this.pressure_mb = pressure_mb;
        this.region = region;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.text = text;
        this.tz_id = tz_id;
        this.uv = uv;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.wind_kph = wind_kph;
        this.wind_mph = wind_mph;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
    }

    public CurrentModel(@NonNull CoroutineScope viewModelScope, int cloud, int code, String country, int dewpoint_c, int dewpoint_f, int feelslike_c, int feelslike_f, int gust_kph, int gust_mph, int heatindex_c, int heatindex_f, int humidity, String icon, int is_day, String last_updated, int last_updated_epoch, int lat, String localtime, int localtime_epoch, int lon, String name, int precip_in, int precip_mm, int pressure_in, int pressure_mb, String region, int temp_c, int temp_f, String text, String tz_id, int uv, int vis_km, int vis_miles, int wind_degree, int wind_dir, int wind_kph, int wind_mph, int windchill_c, int windchill_f, @NonNull AutoCloseable... closeables) {
        super(viewModelScope, closeables);
        this.cloud = cloud;
        this.code = code;
        this.country = country;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.gust_kph = gust_kph;
        this.gust_mph = gust_mph;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.humidity = humidity;
        this.icon = icon;
        this.is_day = is_day;
        this.last_updated = last_updated;
        this.last_updated_epoch = last_updated_epoch;
        this.lat = lat;
        this.localtime = localtime;
        this.localtime_epoch = localtime_epoch;
        this.lon = lon;
        this.name = name;
        this.precip_in = precip_in;
        this.precip_mm = precip_mm;
        this.pressure_in = pressure_in;
        this.pressure_mb = pressure_mb;
        this.region = region;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.text = text;
        this.tz_id = tz_id;
        this.uv = uv;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.wind_kph = wind_kph;
        this.wind_mph = wind_mph;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
    }

    public int getCloud() {
        return cloud;
    }

    public int getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public int getDewpoint_c() {
        return dewpoint_c;
    }

    public int getDewpoint_f() {
        return dewpoint_f;
    }

    public int getFeelslike_c() {
        return feelslike_c;
    }

    public int getFeelslike_f() {
        return feelslike_f;
    }

    public int getGust_kph() {
        return gust_kph;
    }

    public int getGust_mph() {
        return gust_mph;
    }

    public int getHeatindex_c() {
        return heatindex_c;
    }

    public int getHeatindex_f() {
        return heatindex_f;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getIcon() {
        return icon;
    }

    public int getIs_day() {
        return is_day;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public int getLat() {
        return lat;
    }

    public String getLocaltime() {
        return localtime;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

    public int getLon() {
        return lon;
    }

    public String getName() {
        return name;
    }

    public int getPrecip_in() {
        return precip_in;
    }

    public int getPrecip_mm() {
        return precip_mm;
    }

    public int getPressure_in() {
        return pressure_in;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public String getRegion() {
        return region;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public int getTemp_f() {
        return temp_f;
    }

    public String getText() {
        return text;
    }

    public String getTz_id() {
        return tz_id;
    }

    public int getUv() {
        return uv;
    }

    public int getVis_km() {
        return vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public int getWind_dir() {
        return wind_dir;
    }

    public int getWind_kph() {
        return wind_kph;
    }

    public int getWind_mph() {
        return wind_mph;
    }

    public int getWindchill_c() {
        return windchill_c;
    }

    public int getWindchill_f() {
        return windchill_f;
    }
}