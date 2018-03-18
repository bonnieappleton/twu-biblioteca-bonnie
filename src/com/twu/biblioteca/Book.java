package com.twu.biblioteca;

import java.util.HashMap;

public class Book extends Content {
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        super(title);
        this.author = author;
        this.year = year;
    }

    public HashMap getDetails() {
        HashMap details = super.getDetails();
        details.put("author", this.author);
        details.put("year", this.year);

        return details;
    }
}
