package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;


public class TestBibliotecaApp {

    @Test
    public void testCreateBookList() {
        ArrayList<Book> list = BibliotecaApp.createLibrary();
        assertNotNull(list);
    }

    @Test
    public void testInputIsValidWithValidInput() {
        ArrayList<Menu.MenuItem> menu = new ArrayList<Menu.MenuItem>();
        Menu.MenuItem listBooks = new Menu.MenuItem("List Books");
        menu.add(listBooks);
        assertEquals(true, BibliotecaApp.inputIsValid("list books", menu));
    }

    @Test
    public void testInputIsValidWithInvalidInput() {
        ArrayList<Menu.MenuItem> menu = new ArrayList<Menu.MenuItem>();
        Menu.MenuItem listBooks = new Menu.MenuItem("List Books");
        menu.add(listBooks);
        assertEquals(false, BibliotecaApp.inputIsValid("no books for me", menu));
    }



}