package com.yourcompany.app.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackBuddiesTest {
    public HackBuddies hackBuddies;

    @BeforeEach
    void setUp() {
        hackBuddies = new HackBuddies();
    }

    @Test
    void registerUser() {
        assertEquals(0, hackBuddies.getUsers().size());
        hackBuddies.registerUser("Aiden", User.StudyLevel.UNIVERSITY, 4);
        assertEquals(1, hackBuddies.getUsers().size());
        hackBuddies.registerUser("Selina", User.StudyLevel.GRADUATE, 1);
        assertEquals(2, hackBuddies.getUsers().size());
    }

    @Test
    void createPosting() {
        assertEquals(0, hackBuddies.getPostings().size());
        hackBuddies.createPosting("Looking for back-end engineer!", Posting.Channel.NEW_HACKS_2024, 1, "");
        assertEquals(1, hackBuddies.getPostings().size());
    }
}