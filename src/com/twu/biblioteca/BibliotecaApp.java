package com.twu.biblioteca;

import java.util.*;
import java.util.ArrayList;

public class BibliotecaApp {
    private static ArrayList<Book> library;
    private static ArrayList<Menu.MenuItem> menu;

    public static void main(String[] args) {
        welcomeMessage();
        library = createLibrary();
        menu = Menu.createMenu();

        displayBookList();

        Boolean sessionInProgress = true;

        while (sessionInProgress) {
            displayMenu();
            handleInput();
        }
    }

    public static void welcomeMessage() {
        String message = "Welcome to Biblioteca, book lover!";
        System.out.println(message);
        System.out.println();
    }

    public static ArrayList<Book> createLibrary() {
        return BookList.createBookList();
    }

    public static void displayBookList() {
        System.out.println("Here are some books:");
        for (Book book : library) {
            HashMap details = book.getDetails();
            System.out.println(details.get("title") + " | " + details.get("author") + " | " + details.get("year"));
        }
    }

    public static void displayMenu() {
        System.out.print("What would you like to do? ");
        for (Menu.MenuItem menuItem : menu) {
            System.out.println(" [" + menuItem.getDisplayName() + "] ");
        }
    }


    public static void handleInput() {
        InputHelper helper = new InputHelper();
        String input = helper.getUserInput();
        String lowercaseInput = input.toLowerCase();

        Boolean inputIsValid = inputIsValid(lowercaseInput, menu);

        if (inputIsValid && lowercaseInput.equals("list books")) {
            displayBookList();
        } else {
            System.out.println("Sorry, that's not an option :(");
        }
        System.out.println();
    }

    public static Boolean inputIsValid(String input, ArrayList<Menu.MenuItem> menu) {
        Boolean isValid = false;
        for (Menu.MenuItem menuItem : menu) {
            String name = menuItem.getName();
            if (input.equals(name)) {
                isValid = true;
            }
        }
        return isValid;
    }

}
