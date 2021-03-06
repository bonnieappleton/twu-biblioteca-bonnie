package com.twu.biblioteca;

import org.junit.Test;

import com.twu.biblioteca.MenuItems.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMenu {

    @Test
    public void testCreateMenu() {
        ArrayList<MenuItem> menu = Menu.createMenu();
        int menuLength = menu.size();
        assertEquals(5, menuLength);
    }

    @Test
    public void testGetMenuItemName() {
        ListBooksOption menuItem = new ListBooksOption();
        String name = menuItem.getName();
        assertEquals("list books", name);
    }

    @Test
    public void testGetMenuItemDisplayName() {
        MenuItem menuItem = new ListBooksOption();
        String name = menuItem.getDisplayName();
        assertEquals("List books", name);
    }
}