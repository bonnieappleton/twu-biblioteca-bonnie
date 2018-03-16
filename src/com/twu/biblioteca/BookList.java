package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    public static ArrayList<Book> createBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book("Head First Java", "Kathy Sierra", 2000);
        Book book2 = new Book("Nights At The Circus", "Angela Carter", 1985);
        Book book3 = new Book("Kafka On The Shore", "Haruki Murakami", 1999);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }
}
