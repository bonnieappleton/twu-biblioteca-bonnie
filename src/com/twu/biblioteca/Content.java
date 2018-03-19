package com.twu.biblioteca;

abstract class Content {
    private String name;
    private String title;
    private int year;

    public Boolean isCheckedOut = false;

    public Content(String title, int year) {
        this.name = title.toLowerCase();
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void checkoutContent() {
        if (this.isCheckedOut) {
            System.out.println("Sorry, that is not available");
        } else {
            this.isCheckedOut = true;
            System.out.println("You have successfully checked out " + this.title);
        }
    }

    public void returnContent() {
        if (this.isCheckedOut) {
            this.isCheckedOut = false;
            System.out.println("You have successfully returned " + this.title);
        } else {
            System.out.println("Sorry, that can't be returned");
        }
    }

    public void displayInformation() {
        System.out.println(this.title + " | " + " | " + this.year);
    }
}

