package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static ArrayList<MenuItem> menu;
    private static Library library;

    public Menu(Library library) {
        this.menu = createMenu();
        this.library = library;
    }

    public static ArrayList<MenuItem> createMenu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        MenuItem books = new ListBooksOption();
        MenuItem checkoutBook = new CheckoutBookOption();
        MenuItem quit = new QuitOption();
        menu.add(books);
        menu.add(checkoutBook);
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
                menuItem.menuAction();
                inputIsValid = true;
            }
        }
        if (!inputIsValid) {
            System.out.println("Sorry, that's not an option :(");
        }
        System.out.println();
    }

    abstract static class MenuItem {
        private String name;
        private String displayName;

        public void setNames(String name) {
            this.name = name.toLowerCase();
            this.displayName = name;
        }

        public String getName() {
            return this.name;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public abstract void menuAction();
    }

    public static class ListBooksOption extends MenuItem {

        public ListBooksOption() {
            setNames("List books");
        }

        public void menuAction() {
            library.displayLibrary();
        }
    }

    public static class CheckoutBookOption extends MenuItem {

        public CheckoutBookOption() {
            setNames("Checkout a book");
        }

        public void menuAction() {
            InputHelper helper = new InputHelper();
            String input = helper.getUserInput("Which book would you like to check out?");
            String lowercaseInput = input.toLowerCase();
            Boolean bookIsValid = false;

            for (Book book : library.getLibrary()) {
                if (lowercaseInput.equals(book.getName())) {
                    if (book.isCheckedOut) {
                        System.out.println("That book is not available");
                    } else {
                        book.checkout();
                        bookIsValid = true;
                    }
                }
            }
            if (!bookIsValid) {
                System.out.println("Sorry, that's not a valid book :(");
            }
            System.out.println();
        }
    }

    public static class QuitOption extends MenuItem {

        public QuitOption() {
            setNames("Quit");
        }

        public void menuAction() {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

}
