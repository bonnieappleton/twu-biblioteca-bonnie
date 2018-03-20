package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;

public class QuitOption extends MenuItem {

    public QuitOption() {
        setNames("Quit");
    }

    public void menuAction(Library library, Authentication authentication) {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
