package com.twu.biblioteca;

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
        setRating(rating);
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 1 and 10");
        }
    }

    public String getRatingString() {
        if (this.rating == 0) {
            return "Unrated";
        } else {
            return rating + " *";
        }
    }

    public void displayInformation() {
        System.out.println(this.getTitle() + " | " + this.director + " | " + this.getYear() + " | " + this.getRatingString());
    }
}
