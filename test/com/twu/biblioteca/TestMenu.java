package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMenu {

    @Test
    public void testCreateMenu() {
        ArrayList<Menu.MenuItem> menu = Menu.createMenu();
        int menuLength = menu.size();
        assertEquals(2, menuLength);
    }

    @Test
    public void testGetMenuItemName() {
        Menu.MenuItem menuItem = new Menu.MenuItem("Go here");
        String name = menuItem.getName();
        assertEquals("go here", name);
    }

    @Test
    public void testGetMenuItemDisplayName() {
        Menu.MenuItem menuItem = new Menu.MenuItem("Go here");
        String name = menuItem.getDisplayName();
        assertEquals("Go here", name);
    }
}