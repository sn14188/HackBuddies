package com.yourcompany.app.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostingTest {
    public Posting posting;
    public User user;

    @BeforeEach
    void setUp() {
        posting = new Posting("Looking for UX/UI designer!", Posting.Channel.NEW_HACKS_2024, 4);
    }

    @Test
    void getName() {
        assertEquals("Looking for UX/UI designer!", posting.getName());
    }

    @Test
    void getChannel() {
        assertEquals(Posting.Channel.NEW_HACKS_2024, posting.getChannel());
    }

    @Test
    void getSpot() {
        assertEquals(4, posting.getSpot());
    }

    @Test
    void decreaseRemainingSpot() {
        posting.decreaseRemainingSpot();
        assertEquals(3, posting.getSpot());
    }

    @Test
    void setStatusSearching() {
        assertEquals(Posting.Status.STILL_SEARCHING, posting.getStatus());
    }

    @Test
    void setStatusInCommunication() {
        posting.setStatusInCommunication();
        assertEquals(Posting.Status.IN_COMMUNICATION, posting.getStatus());
    }

    @Test
    void setStatusFound() {
        posting.setStatusFound();
        assertEquals(Posting.Status.FOUND, posting.getStatus());
    }

    @Test
    void setPostingClosed() {
        assertTrue(posting.isActive());
        posting.setPostingClosed();
        assertFalse(posting.isActive());
    }

    @Test
    void writeDescription() {
        posting.writeDescription("I need you ASAP!");
        assertEquals("I need you ASAP!", posting.getContents());
        posting.clearDescription();
        assertEquals("", posting.getContents());
    }

    @Test
    void addRole() {
        assertEquals(0, posting.getRolesNeeded().size());
        posting.addRole(Posting.Role.BACK_END);
        assertEquals(1, posting.getRolesNeeded().size());
    }

    @Test
    void addUser() {
        assertEquals(0, posting.getUsersInTeam().size());
        posting.addUser(user);
        assertEquals(1, posting.getUsersInTeam().size());
    }
}
