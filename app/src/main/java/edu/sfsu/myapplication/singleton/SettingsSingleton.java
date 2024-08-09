package edu.sfsu.myapplication.singleton;

import java.util.ArrayList;

import edu.sfsu.myapplication.ui.placeholder.PlaceholderContent;

public class SettingsSingleton {

    private static final SettingsSingleton obj = new SettingsSingleton();

    private final ArrayList<PlaceholderContent.PlaceholderItem> model;

    public static SettingsSingleton getInstance() {
        return obj;
    }

    private SettingsSingleton() {
        model = new ArrayList<>();
    }

    public ArrayList<PlaceholderContent.PlaceholderItem> getData() {
        return model;
    }
}