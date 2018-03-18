package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        this.library = createLibrary();
    }

    public static ArrayList<Book> createLibrary() {
        ArrayList<Book> library = new ArrayList<Book>();

        Book book1 = new Book("Head First Java", "Kathy Sierra", 2000);
        Book book2 = new Book("Nights At The Circus", "Angela Carter", 1985);
        Book book3 = new Book("Kafka On The Shore", "Haruki Murakami", 1999);

        library.add(book1);
        library.add(book2);
        library.add(book3);

        return library;
    }

    public void displayLibrary() {
        System.out.println("Here are some books:");
        for (Book book : this.library) {
            if (!book.isCheckedOut) {
                HashMap details = book.getDetails();
                System.out.println(details.get("title") + " | " + details.get("author") + " | " + details.get("year"));
            }
        }
    }

    public ArrayList<Book> getLibrary() {
        return this.library;
    }
}
