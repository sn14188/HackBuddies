package com.yourcompany.app.model;

public class Message {
    public enum MessageStatus { UNRESOLVED, RESOLVED }
    private MessageStatus status;
    private final String content;

    public Message(String content) {
        this.status = MessageStatus.UNRESOLVED;
        this.content = content;
    }

    public void updateStatus() {
        this.status = MessageStatus.RESOLVED;
    }

    public String getContent() {
        return this.content;
    }

    public MessageStatus getStatus() {
        return this.status;
    }

}
