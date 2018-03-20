package com.twu.biblioteca;

import java.util.ArrayList;

public class Authentication {
    ArrayList<User> users;
    User currentUser = null;

    public Authentication() {
        users = createUserList();
    }

    public ArrayList<User> createUserList() {
        return CSVReader.getUsers();
    }

    public void login() {
        InputHelper helper = new InputHelper();
        Boolean loginValid = false;

        String libraryNumber = helper.getUserInput("Library number: ");
        User user = getUser(libraryNumber);

        String password = helper.getUserInput("Password: ");

        if (user != null) {
            loginValid = validatePassword(user, password);
        }

        if (loginValid) {
            System.out.println("Hello " + user.getName() + " you have been successfully logged in ");
            this.currentUser = user;
        } else {
            System.out.println("Sorry, that username/password combination is invalid");
        }
    }

    public User getUser(String libraryNumber) {
        User currentUser = null;
        for (User user : users) {
            if (libraryNumber == user.getLibraryNumber()) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public Boolean validatePassword(User user, String password) {
        String userPassword = user.getPassword();
        if (userPassword.equals(password)) {
            return true;
        }
        return false;
    }
}
