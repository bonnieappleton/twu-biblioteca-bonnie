package com.twu.biblioteca;

import java.util.*;

public class Content {
    private String name;
    private String title;
    public Boolean isCheckedOut = false;

    public Content(String title) {
        this.name = title.toLowerCase();
        this.title = title;
    }

    public HashMap getDetails() {
        HashMap details = new HashMap();
        details.put("title", this.title);

        return details;
    }

    public String getName() {
        return this.name;
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
}

