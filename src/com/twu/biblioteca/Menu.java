package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<MenuItem> createMenu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        MenuItem books = new MenuItem("List Books");
        MenuItem quit = new MenuItem("Quit");
        menu.add(books);
        menu.add(quit);

        return menu;
    }

    public static class MenuItem {
        private String name;
        private String displayName;

        public MenuItem(String name) {
            this.name = name.toLowerCase();
            this.displayName = name;
        }

        public String getName() {
            return this.name;
        }

        public String getDisplayName() {
            return this.displayName;
        }
    }
}
