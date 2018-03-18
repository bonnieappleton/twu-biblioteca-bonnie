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

    public HashMap getDetails() {
        HashMap details = super.getDetails();
        details.put("director", this.director);
        if (this.rating == 0) {
            details.put("rating", "unrated");
        } else {
            details.put("rating", this.rating);
        }

        return details;
    }
}
