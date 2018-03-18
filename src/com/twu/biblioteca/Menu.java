package com.twu.biblioteca;

import java.util.ArrayList;

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
        MenuItem checkoutBook = new CheckoutOption();
        MenuItem returnBook = new ReturnOption();
        MenuItem quit = new QuitOption();

        menu.add(books);
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

    public static class CheckoutOption extends MenuItem {

        public CheckoutOption() {
            setNames("Checkout an item");
        }

        public void menuAction() {
            InputHelper helper = new InputHelper();
            String input = helper.getUserInput("Which book or movie would you like to check out?");
            String lowercaseInput = input.toLowerCase();
            Boolean bookIsValid = false;

            for (Book book : library.getLibrary()) {
                if (lowercaseInput.equals(book.getName())) {
                    book.checkoutContent();
                    bookIsValid = true;
                }
            }
            if (!bookIsValid) {
                System.out.println("Sorry, we don't have that :(");
            }
            System.out.println();
        }
    }

    public static class ReturnOption extends MenuItem {

        public ReturnOption() {
            setNames("Return an item");
        }

        public void menuAction() {
            InputHelper helper = new InputHelper();
            String input = helper.getUserInput("Which book or movie would you like to return?");
            String lowercaseInput = input.toLowerCase();
            Boolean bookIsValid = false;

            for (Book book : library.getLibrary()) {
                if (lowercaseInput.equals(book.getName())) {
                    book.returnContent();
                    bookIsValid = true;
                }
            }
            if (!bookIsValid) {
                System.out.println("Sorry, you can't return that :(");
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
