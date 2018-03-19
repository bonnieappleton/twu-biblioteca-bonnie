package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public static ArrayList<Book> getBooks() {
        String books = "data/books.csv";
        String line;

        ArrayList<Book> bookList = new ArrayList<Book>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader(books));

            while ((line = reader.readLine()) != null) {
                String[] info = line.split(",");
                String title = info[0];
                String author = info[1];
                int year = Integer.parseInt(info[2]);
                Book book = new Book(title, author, year);

                bookList.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookList;
    }

    public static ArrayList<Movie> getMovies() {
        String movies= "data/movies.csv";
        String line;

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(movies));

            while ((line = reader.readLine()) != null) {
                String[] info = line.split(",");
                Movie movie;
                String title = info[0];
                String director = info[1];
                int year = Integer.parseInt(info[2]);
                if (info.length > 3) {
                    int rating = Integer.parseInt(info[3]);
                    movie = new Movie(title, director, year, rating);
                } else {
                    movie = new Movie(title, director, year);
                }

                movieList.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return movieList;
    }
}
