package com.twu.biblioteca;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestContent {

//    @Test
//    public void testBookDetails() {
//        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
//        HashMap actualDetails = testBook.getDetails();
//
//        HashMap expectedDetails = new HashMap();
//        expectedDetails.put("title", new String("Northern Lights"));
//        expectedDetails.put("author", new String("Philip Pullman"));
//        expectedDetails.put("year", 1995);
//
//        assertEquals(expectedDetails, actualDetails);
//    }
//
//    @Test
//    public void testMovieDetails() {
//        Movie testMovie = new Movie("Amelie", "Jean-Pierre Jeunet", 1995, 9);
//        HashMap actualDetails = testMovie.getDetails();
//
//        HashMap expectedDetails = new HashMap();
//        expectedDetails.put("title", new String("Amelie"));
//        expectedDetails.put("director", new String("Jean-Pierre Jeunet"));
//        expectedDetails.put("year", 1995);
//        expectedDetails.put("rating", 9);
//
//        assertEquals(expectedDetails, actualDetails);
//    }

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