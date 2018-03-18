package com.twu.biblioteca;

import java.util.HashMap;

public class Movie extends Content {
    private String director;
    private int rating = 0;

    public Movie(String title, String director, int year) {
        super(title, year);
        this.director = director;
    }

    public Movie(String title, String director, int year, int rating) {
        super(title, year);
        this.director = director;
        if (rating > 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 1 and 10");
        }
    }

    public String getDirector() {
        return this.director;
    }

    public int getRating() {
        return this.rating;
    }
}
