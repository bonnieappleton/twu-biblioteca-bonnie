package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;
    private ArrayList<Movie> movieList;
    private ArrayList<Content> libraryList;

    public Library() {
        bookList = createBookList();
        movieList = createMovieList();
        libraryList = createLibrary();
    }

    public ArrayList<Book> createBookList() {
        return CSVReader.getBooks();
    }

    public ArrayList<Movie> createMovieList() {
        return CSVReader.getMovies();
    }

    public ArrayList<Content> createLibrary() {
        ArrayList<Content> content = new ArrayList<Content>();
        content.addAll(bookList);
        content.addAll(movieList);
        return content;
    }

    public void displayBooks() {
        System.out.println("Here are some books:");
        for (Book content : this.bookList) {
            if (!content.isCheckedOut) content.displayInformation();
        }
        System.out.println();
    }

    public void displayMovies() {
        System.out.println("Here are some movies:");
        for (Movie content : this.movieList) {
            if (!content.isCheckedOut) content.displayInformation();
        }
        System.out.println();
    }

    public void checkoutItems() {
        InputHelper helper = new InputHelper();
        String input = helper.getUserInput("Which book or movie would you like to check out?");
        String lowercaseInput = input.toLowerCase();
        Boolean isValid = false;

        for (Content content : libraryList) {
            if (lowercaseInput.equals(content.getName())) {
                content.checkoutContent();
                isValid = true;
            }
        }
        if (!isValid) System.out.println("Sorry, we don't have that :(");

        System.out.println();
    }

    public void returnItems() {
        InputHelper helper = new InputHelper();
        String input = helper.getUserInput("Which book or movie would you like to return?");
        String lowercaseInput = input.toLowerCase();
        Boolean isValid = false;

        for (Content content : libraryList) {
            if (lowercaseInput.equals(content.getName())) {
                content.returnContent();
                isValid = true;
            }
        }
        if (!isValid) System.out.println("Sorry, you can't return that :(");
        System.out.println();
    }
}
