package edu.sfsu.myapplication.singleton;

import java.util.ArrayList;

import edu.sfsu.myapplication.model.CurrentModel;

/*
 * Singleton Pattern
 * */

public class CurrentWeather {
    /**
     * Instantiate an instance of itself.
     */
    private static final CurrentWeather obj = new CurrentWeather();

    /**
     * Use this method to get an instance of this object.
     */
    private final ArrayList<CurrentModel> model;

    public static CurrentWeather getInstance() {
        return obj;
    }

    /**
     * The constructor is private.
     * Only this class (CurrentWeather) can ever instantiate it.
     */
    private CurrentWeather() {
        model = new ArrayList<>();
    }

    /**
     * Anyone can get a list of models
     */
    public ArrayList<CurrentModel> getData() {
        return model;
    }
}