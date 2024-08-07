package edu.sfsu.myapplication.singleton;

import android.view.Menu;

import java.util.ArrayList;

import edu.sfsu.myapplication.model.CurrentModel;
import edu.sfsu.myapplication.model.MenuModel;

/*
 * Singleton Pattern
 * */

public class CurrentWeather {
    private static final CurrentWeather obj = new CurrentWeather();

    private final ArrayList<CurrentModel> model;

    public static CurrentWeather getInstance() {
        return obj;
    }

    /**
     * The constructor is private
     * Only this class (CurrentWeather) can ever instantiate it.
     */
    private CurrentWeather() {
        model = new ArrayList<>();
    }

    /**
     * Anyone can get a list of models
     * @return model
     */
    public ArrayList<CurrentModel> getData() {
        return model;
    }
}