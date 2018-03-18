package com.twu.biblioteca;

public class BibliotecaApp {
    private static Library library;
    private static Menu menu;

    public static void main(String[] args) {
        welcomeMessage();
        library = new Library();
        menu = new Menu(library);

        library.displayBooks();
        library.displayMovies();

        while (true) {
            menu.displayMenu();
            menu.handleInput();
        }
    }

    public static void welcomeMessage() {
        String message = "Welcome to Biblioteca, book lover!";
        System.out.println(message);
        System.out.println();
    }
}
