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
        displayMenu();
    }

    public static String welcomeMessage() {
        String message = "Welcome to Biblioteca, book lover!";
        System.out.println(message);
        System.out.println();
        return message;
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
        System.out.println();
    }

    public static void displayMenu() {
        System.out.print("What would you like to do? ");
        for (Menu.MenuItem menuItem : menu) {
            System.out.println(" [" + menuItem.getName() + "] ");
        }
        System.out.println();
    }

}
