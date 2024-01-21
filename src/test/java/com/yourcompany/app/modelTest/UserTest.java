package com.yourcompany.app.modelTest;

import com.yourcompany.app.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class UserTest {
    public User user;

    @BeforeEach
    void setup() {
        user = new User("Aiden");
    }

    @Test
    void testName() {
        assertEquals("Aiden", user.getName());
    }
}
