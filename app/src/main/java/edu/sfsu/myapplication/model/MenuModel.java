package edu.sfsu.myapplication.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import kotlinx.coroutines.CoroutineScope;

public class MenuModel extends ViewModel {
    private final String current;
    private final String forecast;
    private final String History;
    private final String Marine;
    private final String Sports;

    public MenuModel(String current, String forecast, String history, String marine, String sports) {
        this.current = current;
        this.forecast = forecast;
        this.History = history;
        this.Marine = marine;
        this.Sports = sports;
    }

    public MenuModel(String current, String forecast, String history, String marine, String sports, @NonNull AutoCloseable... closeables) {
        super(closeables);
        this.current = current;
        this.forecast = forecast;
        History = history;
        Marine = marine;
        Sports = sports;
    }

    public MenuModel(@NonNull CoroutineScope viewModelScope, String current, String forecast, String history, String marine, String sports) {
        super(viewModelScope);
        this.current = current;
        this.forecast = forecast;
        History = history;
        Marine = marine;
        Sports = sports;
    }

    public MenuModel(@NonNull CoroutineScope viewModelScope, String current, String forecast, String history, String marine, String sports, @NonNull AutoCloseable... closeables) {
        super(viewModelScope, closeables);
        this.current = current;
        this.forecast = forecast;
        History = history;
        Marine = marine;
        Sports = sports;
    }

    public String getCurrent() {
        return current;
    }

    public String getForecast() {
        return forecast;
    }

    public String getHistory() {
        return History;
    }

    public String getMarine() {
        return Marine;
    }

    public String getSports() {
        return Sports;
    }
}