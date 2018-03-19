package com.twu.biblioteca;

public class Authentication {

    public static void login() {
        InputHelper helper = new InputHelper();
        String libraryNumber = helper.getUserInput("Library number: ");
        System.out.println(libraryNumber);
        String password = helper.getUserInput("Password: ");
        System.out.println(password);
    }
}
