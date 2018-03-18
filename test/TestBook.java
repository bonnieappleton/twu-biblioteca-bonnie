package com.twu.biblioteca;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestBook {

    @Test
    public void testBookDetails() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        HashMap actualDetails = testBook.getDetails();

        HashMap expectedDetails = new HashMap();
        expectedDetails.put("title", new String("Northern Lights"));
        expectedDetails.put("author", new String("Philip Pullman"));
        expectedDetails.put("year", 1995);

        assertEquals(expectedDetails, actualDetails);
    }

    @Test
    public void testCheckout() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutBook();
        assertEquals(true, testBook.isCheckedOut);
    }

    @Test
    public void testUnsuccessfulCheckout() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutBook();
        testBook.checkoutBook();
        assertEquals(true, testBook.isCheckedOut);
    }

    @Test
    public void testReturn() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.checkoutBook();
        testBook.returnBook();
        assertEquals(false, testBook.isCheckedOut);
    }

    @Test
    public void testUnsuccessfulReturn() {
        Book testBook = new Book("Northern Lights", "Philip Pullman", 1995);
        testBook.returnBook();
        assertEquals(false, testBook.isCheckedOut);
    }
}