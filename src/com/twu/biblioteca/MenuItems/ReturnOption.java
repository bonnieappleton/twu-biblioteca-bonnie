package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;

public class ReturnOption extends MenuItem {

    public ReturnOption() {
        setNames("Return an item");
    }

    public void menuAction(Library library, Authentication authentication) {
        library.returnItems();
    }
}
