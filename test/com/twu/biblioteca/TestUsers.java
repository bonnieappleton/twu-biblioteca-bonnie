package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUsers {

    @Test
    public void testGetLibraryNumber() {
        User user = new User("111-2222", "password", "Bonnie", "bonnie@bonnie.com", 01234111222);
        String libraryNumber = user.getLibraryNumber();
        assertEquals("111-2222", libraryNumber);
    }
}
