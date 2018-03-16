package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class TestBookList {

    @Test
    public void testCreateBookList() {
        ArrayList<Book> bookArray = BookList.createBookList();
        int bookListLength = bookArray.size();
        assertEquals(3, bookListLength);
    }
}
