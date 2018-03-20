package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;

public class ListBooksOption extends MenuItem {

    public ListBooksOption() {
        setNames("List books");
    }

    public void menuAction(Library library, Authentication authentication) {
        library.displayBooks();
    }
}