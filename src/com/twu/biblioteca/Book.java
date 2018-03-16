package com.twu.biblioteca;

import java.util.*;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public HashMap getDetails() {
        HashMap details = new HashMap();
        details.put("title", this.title);
        details.put("author", this.author);
        details.put("year", this.year);

        return details;
    }

}

