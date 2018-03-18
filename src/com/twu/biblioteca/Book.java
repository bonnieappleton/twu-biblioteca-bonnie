package com.twu.biblioteca;

import java.util.*;

public class Book {
    private String name;
    private String title;
    private String author;
    private int year;
    public Boolean isCheckedOut = false;

    public Book(String title, String author, int year) {
        this.name = title.toLowerCase();
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

    public String getName() {
        return this.name;
    }

    public void checkoutBook() {
        if (this.isCheckedOut) {
            System.out.println("Sorry, that book is not available");
        } else {
            this.isCheckedOut = true;
            System.out.println("You have successfully checked out " + this.title);
        }
    }

    public void returnBook() {
        if (this.isCheckedOut) {
            this.isCheckedOut = false;
            System.out.println("You have successfully returned " + this.title);
        } else {
            System.out.println("Sorry, that book can't be returned");
        }
    }
}

