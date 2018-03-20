package com.twu.biblioteca.MenuItems;

import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;

public class ListMoviesOption extends MenuItem {

    public ListMoviesOption() {
        setNames("List movies");
    }

    public void menuAction(Library library, Authentication authentication) {
        library.displayMovies();
    }
}
