package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class TestLibrary {

    @Test
    public void testCreateLibrary() {
        ArrayList<Book> bookArray = Library.createLibrary();
        int bookListLength = bookArray.size();
        assertEquals(3, bookListLength);
    }
}
