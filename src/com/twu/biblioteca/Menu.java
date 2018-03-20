package com.twu.biblioteca;

import com.twu.biblioteca.MenuItems.*;

import java.util.ArrayList;


public class Menu {
    private static ArrayList<MenuItem> menu;
    private static Library library;
    private static Authentication authentication;

    public Menu(Library library, Authentication authentication) {
        this.library = library;
        this.authentication = authentication;
        this.menu = createMenu();
    }

    public static ArrayList<MenuItem> createMenu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

        MenuItem login = new LoginOption();
        MenuItem books = new ListBooksOption();
        MenuItem movies = new ListMoviesOption();
        MenuItem checkoutBook = new CheckoutOption();
        MenuItem returnBook = new ReturnOption();
        MenuItem quit = new QuitOption();

        menu.add(login);
        menu.add(books);
        menu.add(movies);
        menu.add(checkoutBook);
        menu.add(returnBook);
        menu.add(quit);

        return menu;
    }

    public void displayMenu() {
        System.out.print("What would you like to do? ");
        for (MenuItem menuItem : menu) {
            System.out.print(" [" + menuItem.getDisplayName() + "] ");
        }
        System.out.println();
    }


    public static void handleInput() {
        InputHelper helper = new InputHelper();
        String input = helper.getUserInput();
        String lowercaseInput = input.toLowerCase();
        Boolean inputIsValid = false;

        for (MenuItem menuItem : menu) {
            if (lowercaseInput.equals(menuItem.getName())) {
                menuItem.menuAction(library, authentication);
                inputIsValid = true;
            }
        }
        if (!inputIsValid) {
            System.out.println("Sorry, that's not an option :(");
        }
        System.out.println();
    }
}
