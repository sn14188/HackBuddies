package com.yourcompany.app.model;

import java.util.ArrayList;

public class HackBuddies {
    private ArrayList<User> users;
    private ArrayList<Posting> postings;

    public HackBuddies() {
        this.users = new ArrayList<User>();
        this.postings = new ArrayList<Posting>();
    }

    public ArrayList<Posting> getPostings() {
        return postings;
    }

    public void registerUser(String name, User.StudyLevel studyLevel, int studyYear) {
        User newUser = new User(name, studyLevel, studyYear);
        users.add(newUser);
    }

    public Posting createPosting(User user, String postingName, Posting.Channel channel, int spots, String description) {
        Posting newPosting = user.doPost(postingName, channel, spots, description);
        postings.add(newPosting);
        return newPosting;
    }

    public void sendMessageToPosting(User user, Posting posting, String message) {
        user.sendMessage(posting, message);
        posting.receiveMessage(message);
    }

    public void resolveMessage(User user, Posting posting, String message) {
    }

    public void resolvePosting(User user, Posting posting) {
        user.makePostResolved(posting);
    }
}
