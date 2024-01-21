package com.yourcompany.app.modelTest;

import com.yourcompany.app.model.Posting;
import com.yourcompany.app.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class PostingTest {
    public Posting posting;

    @BeforeEach
    void setup() {
        posting = new Posting("Looking for UX/UI designer!");
    }

    @Test
    void testName() {
        assertEquals("Looking for UX/UI designer!", posting.getName());
    }
}
