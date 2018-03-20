package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;


public abstract class MenuItem {
    private String name;
    private String displayName;

    public void setNames(String name) {
        this.name = name.toLowerCase();
        this.displayName = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public abstract void menuAction(Library library, Authentication authentication);
}

