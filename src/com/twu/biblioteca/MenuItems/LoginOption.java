package com.twu.biblioteca.MenuItems;


import com.twu.biblioteca.Authentication;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.User;

public class LoginOption extends MenuItem {

    public LoginOption() {
        setNames("Login");
    }

    public void menuAction(Library library, Authentication authentication) {
        authentication.login();
    }
}
