package com.twu.biblioteca;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestContent {

    @Test
    public void testGetName() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        String name = testBook.getName();
        assertEquals("northern lights", name);
    }

    @Test
    public void testGetTitle() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        String title = testBook.getTitle();
        assertEquals("Northern Lights", title);
    }

    @Test
    public void testGetYear() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        int year = testBook.getYear();
        assertEquals(1995, year);
    }

    @Test
    public void testGetRatingString() {
        Movie testMovie = new Movie("Pan's Labyrinth", "Guillermo Del Toro", 2006, 8);
        String rating = testMovie.getRatingString();
        assertEquals("8 *", rating);
    }

    @Test
    public void testGetRatingStringUnrated() {
        Movie testMovie = new Movie("Pan's Labyrinth", "Guillermo Del Toro", 2006, 0);
        String rating = testMovie.getRatingString();
        assertEquals("Unrated", rating);
    }

    @Test
    public void testCheckout() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutContent();
        assertEquals(true, testBook.isCheckedOut);
    }

    @Test
    public void testCheckoutMovie() {
        Movie testMovie = new Movie("Pan's Labyrinth", "Guillermo Del Toro", 2006, 8);
        testMovie.checkoutContent();
        assertEquals(true, testMovie.isCheckedOut);
    }

    @Test
    public void testUnsuccessfulCheckout() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutContent();
        testBook.checkoutContent();
        assertEquals(true, testBook.isCheckedOut);
    }

    @Test
    public void testReturn() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutContent();
        testBook.returnContent();
        assertEquals(false, testBook.isCheckedOut);
    }

    @Test
    public void testUnsuccessfulReturn() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.returnContent();
        assertEquals(false, testBook.isCheckedOut);
    }
}