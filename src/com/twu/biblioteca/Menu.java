package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<MenuItem> createMenu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        MenuItem menuItem = new MenuItem("List Books");
        menu.add(menuItem);

        return menu;
    }

    public static class MenuItem {
        private String name;

        public MenuItem(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
