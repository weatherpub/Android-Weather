package edu.sfsu.myapplication.model;

import androidx.lifecycle.ViewModel;

public class MenuModel {
    private final String menuItem;

    public MenuModel(String item) {
        this.menuItem = item;
    }

    public String getItem() {
        return menuItem;
    }
}