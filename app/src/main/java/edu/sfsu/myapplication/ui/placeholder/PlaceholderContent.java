package edu.sfsu.myapplication.ui.placeholder;

import java.util.ArrayList;

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
        placeholderItem.add(new PlaceholderItem("0", "Notifications", "notifications"));
        placeholderItem.add(new PlaceholderItem("1", "Turn on location based news", "notifications"));
        placeholderItem.add(new PlaceholderItem("2", "Display Settings", "notifications"));
        placeholderItem.add(new PlaceholderItem("3", "Terms and Use", "notifications"));
        placeholderItem.add(new PlaceholderItem("4", "Privacy Policy", "notifications"));
        placeholderItem.add(new PlaceholderItem("5", "Your Privacy Policy", "notifications"));
        placeholderItem.add(new PlaceholderItem("6", "Do Not Sell My Data", "notifications"));

        return placeholderItem;
    }
}