package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;

public class CheckoutOption extends MenuItem {

    public CheckoutOption() {
        setNames("Checkout an item");
    }

    public void menuAction(Library library, Authentication authentication) {
        library.checkoutItems();
    }
}