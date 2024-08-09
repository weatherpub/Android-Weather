package edu.sfsu.myapplication.ui.placeholder;

import java.util.ArrayList;

import edu.sfsu.myapplication.model.CurrentModel;
import edu.sfsu.myapplication.singleton.CurrentWeather;
import edu.sfsu.myapplication.singleton.SettingsSingleton;

public class PlaceholderContent {
    public static final ArrayList<PlaceholderItem> placeholderItem = new ArrayList<>();

    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;

        public PlaceholderItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }


    public static ArrayList<PlaceholderItem> getPlaceholderItemItems()
    {
        SettingsSingleton ss = SettingsSingleton.getInstance();
        ArrayList<PlaceholderItem> model = ss.getData();

        model.add(new PlaceholderItem("0", "Notifications", "notifications"));
        model.add(new PlaceholderItem("1", "Turn on location based news", "notifications"));
        model.add(new PlaceholderItem("2", "Display Settings", "notifications"));
        model.add(new PlaceholderItem("3", "Terms and Use", "notifications"));
        model.add(new PlaceholderItem("4", "Privacy Policy", "notifications"));
        model.add(new PlaceholderItem("5", "Your Privacy Policy", "notifications"));
        model.add(new PlaceholderItem("6", "Do Not Sell My Data", "notifications"));
        model.add(new PlaceholderItem("7", "Limit Use and Disclosure", "notifications"));
        model.add(new PlaceholderItem("7", "CA Notice of Collection", "notifications"));
        model.add(new PlaceholderItem("8", "AP News", "AP News"));
        model.add(new PlaceholderItem("9", "About the Associated Press", "About the Associated Press"));
        model.add(new PlaceholderItem("10", "Send Us Feedback", "About the Associated Press"));

        return model;
    }
}