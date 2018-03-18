package com.twu.biblioteca;

import java.util.HashMap;

public class Book extends Content {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    public HashMap getDetails() {
        HashMap details = super.getDetails();
        details.put("author", this.author);

        return details;
    }
}
