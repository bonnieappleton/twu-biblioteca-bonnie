package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Movie> movieList = new ArrayList<Movie>();
    private ArrayList<Content> library = new ArrayList<Content>();

    public Library() {
        createBookList();
        createMovieList();
        createLibrary();
    }

    public void createBookList() {
        Book book1 = new Book("Head First Java", "Kathy Sierra", 2000);
        Book book2 = new Book("Nights At The Circus", "Angela Carter", 1985);
        Book book3 = new Book("Kafka On The Shore", "Haruki Murakami", 1999);

        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    public void createMovieList() {
        Movie movie1 = new Movie("Princess Mononoke", "Hayao Miyazaki", 1997, 10);
        Movie movie2 = new Movie("Ladybird", "Greta Gerwig", 2018);

        this.movieList.add(movie1);
        this.movieList.add(movie2);
    }

    public void createLibrary() {
        library.addAll(bookList);
        library.addAll(movieList);
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

        for (Content content : library) {
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

        for (Content content : library) {
            if (lowercaseInput.equals(content.getName())) {
                content.returnContent();
                isValid = true;
            }
        }
        if (!isValid) System.out.println("Sorry, you can't return that :(");
        System.out.println();
    }
}
