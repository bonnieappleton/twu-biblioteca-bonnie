package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;


public class TestBibliotecaApp {

    @Test
    public void testWelcomeMessage() {
        assertEquals("Welcome to Biblioteca, book lover!", BibliotecaApp.welcomeMessage());
    }

    @Test
    public void testCreateBookList() {
        ArrayList<Book> list = BibliotecaApp.createLibrary();
        assertNotNull(list);
    }



}