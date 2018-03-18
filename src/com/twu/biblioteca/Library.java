package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Content> library;

    public Library() {
        this.library = createLibrary();
    }

    public static ArrayList<Content> createLibrary() {
        ArrayList<Content> library = new ArrayList<Content>();

        Book book1 = new Book("Head First Java", "Kathy Sierra", 2000);
        Book book2 = new Book("Nights At The Circus", "Angela Carter", 1985);
        Book book3 = new Book("Kafka On The Shore", "Haruki Murakami", 1999);

        Movie movie1 = new Movie("Princess Mononoke", "Hayao Miyazaki", 1997, 10);
        Movie movie2 = new Movie("Ladybird", "Greta Gerwig", 2018);

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(movie1);
        library.add(movie2);

        return library;
    }

    public void displayLibrary() {
        System.out.println("Here are some books:");
        for (Content content : this.library) {
            if (!content.isCheckedOut) {
                HashMap details = content.getDetails();
                System.out.println(details.get("title") + " | " + details.get("author") + " | " + details.get("year"));
            }
        }
        System.out.println();
    }

    public ArrayList<Content> getLibrary() {
        return this.library;
    }
}
