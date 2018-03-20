package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        welcomeMessage();
        Library library = new Library();
        Authentication authentication = new Authentication();
        Menu menu = new Menu(library, authentication);

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
