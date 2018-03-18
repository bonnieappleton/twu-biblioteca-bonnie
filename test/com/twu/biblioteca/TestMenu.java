package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMenu {

    @Test
    public void testCreateMenu() {
        ArrayList<Menu.MenuItem> menu = Menu.createMenu();
        int menuLength = menu.size();
        assertEquals(4, menuLength);
    }

    @Test
    public void testGetMenuItemName() {
        Menu.ListBooksOption menuItem = new Menu.ListBooksOption();
        String name = menuItem.getName();
        assertEquals("list books", name);
    }

    @Test
    public void testGetMenuItemDisplayName() {
        Menu.MenuItem menuItem = new Menu.ListBooksOption();
        String name = menuItem.getDisplayName();
        assertEquals("List books", name);
    }
}