package edu.sfsu.myapplication.ui.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final ArrayList<PlaceholderItem> placeholderItem = new ArrayList<>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    private static final int COUNT = 25;

    /* *
        Java supports a special block, called a 'static' block that can be used for static initialization of a class.
        This code inside the static block is executed only once:  the first item the class is loaded into memory.
    */
    static {
        // Add some sample items.
        /*
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
         */
        placeholderItem.add(new PlaceholderItem("0", "Notifications", "notifications"));
        placeholderItem.add(new PlaceholderItem("1", "Turn on location based news", "notifications"));
        placeholderItem.add(new PlaceholderItem("2", "Display Settings", "notifications"));
        placeholderItem.add(new PlaceholderItem("3", "Terms and Use", "notifications"));
        placeholderItem.add(new PlaceholderItem("4", "Privacy Policy", "notifications"));
        placeholderItem.add(new PlaceholderItem("5", "Your Privacy Policy", "notifications"));
        placeholderItem.add(new PlaceholderItem("6", "Do Not Sell My Data", "notifications"));
    }

    private static void addItem(PlaceholderItem item) {
        placeholderItem.add(item);
        ITEM_MAP.put(item.id, item);
    }

    //private static void createPlaceholderItem() {
        //return new PlaceholderItem(String.valueOf(position), "patrick Item " + position, makeDetails(position));
    //}

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        // builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }

        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
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
}