package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMenu {

    @Test
    public void testCreateMenu() {
        ArrayList<Menu.MenuItem> menu = Menu.createMenu();
        int menuLength = menu.size();
        assertEquals(1, menuLength);
    }
}