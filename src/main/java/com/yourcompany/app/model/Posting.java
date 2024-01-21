package com.yourcompany.app.model;

import java.util.ArrayList;

public class Posting {
    public enum Status { STILL_SEARCHING, IN_COMMUNICATION, FOUND }
    public enum Channel { NEW_HACKS_2024, NEW_HACKS_2023, NEW_HACKS_2022 }
    public enum Role { BACK_END, FRONT_END, UX_UI_DESIGNER }

    private boolean active;
    private String postingName;
    private Status status = Status.STILL_SEARCHING;
    private Channel channel;
    private int spot;
    private String contents;
    private ArrayList<Role> rolesNeeded = new ArrayList<>();
    private ArrayList<User> usersInTeam = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();

    public Posting(String name, Channel channel, int spot) {
        this.active = true;
        this.postingName = name;
        this.channel = channel;
        this.spot = spot;
        this.contents = "";
    }

    public void setPostingClosed() {
        setStatusFound();
        this.active = false;
    }

    public String getName() {
        return this.postingName;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public int getSpot() {
        return this.spot;
    }

    public void decreaseRemainingSpot() {
        this.spot--;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatusSearching() {
        this.status = Status.STILL_SEARCHING;
    }

    public void setStatusInCommunication() {
        this.status = Status.IN_COMMUNICATION;
    }

    public void setStatusFound() {
        this.status = Status.FOUND;
    }

    public void writeDescription(String description) {
        this.contents = description;
    }

    public String getContents() {
        return this.contents;
    }

    public ArrayList<Role> getRolesNeeded() {
        return rolesNeeded;
    }

    public void addRole(Role role) {
        rolesNeeded.add(role);
    }

    public ArrayList<User> getUsersInTeam() {
        return usersInTeam;
    }

    public void addUser(User user) {
        usersInTeam.add(user);
        decreaseRemainingSpot();
        if (this.spot == 0) {
            setPostingClosed();
        } else {
            setStatusSearching();
        }
    }

    // Handling messages
    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void receiveMessage(Message message) {
        setStatusInCommunication();
        messages.add(message);
    }

    public void resolveMessage(Posting posting, User user, String message) {
        messages.remove(message);
    }
}
