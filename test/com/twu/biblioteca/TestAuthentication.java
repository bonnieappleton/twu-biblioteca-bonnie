package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAuthentication {

    @Test
    public void testGetUser() {
        Authentication authentication = new Authentication();
        User user = new User("111-2222", "password", "Bonnie", "bonnie@bonnie.com", 01234111222);
        authentication.users.add(user);

        assertEquals(user, authentication.getUser("111-2222"));
    }

    @Test
    public void testValidatePassword() {
        Authentication authentication = new Authentication();
        User user = new User("111-2222", "password", "Bonnie", "bonnie@bonnie.com", 01234111222);
        Boolean isValid = authentication.validatePassword(user, "password");

        assertEquals(true, isValid);
    }
}
