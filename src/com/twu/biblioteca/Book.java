package com.twu.biblioteca;

public class Book extends Content {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}
