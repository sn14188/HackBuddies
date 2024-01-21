package com.yourcompany.app.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    public Message message;

    @BeforeEach
    void setUp() {
        message = new Message("I wanna be your team!");
    }

    @Test
    void updateStatus() {
        assertEquals(Message.MessageStatus.UNRESOLVED, message.getStatus());
        message.updateStatus();
        assertEquals(Message.MessageStatus.RESOLVED, message.getStatus());
    }
}