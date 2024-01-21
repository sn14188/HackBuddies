package com.yourcompany.app.model;

import java.util.ArrayList;

public class HackBuddies {
    private ArrayList<User> users;
    private ArrayList<Posting> postings;

    public HackBuddies() {
        this.users = new ArrayList<User>();
        this.postings = new ArrayList<Posting>();
    }

    // Handling user
    public void registerUser(String name, User.StudyLevel studyLevel, int studyYear) {
        User newUser = new User(name, studyLevel, studyYear);
        users.add(newUser);
    }

    // Handling posting
    public Posting createPosting(String postingName, Posting.Channel channel, int spots, String description) {
        Posting newPosting = new Posting(postingName, channel, spots);
        newPosting.writeDescription(description);
        postings.add(newPosting);
        return newPosting;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Posting> getPostings() {
        return postings;
    }

//    public void resolvePosting(User user, Posting posting) {
//        user.makePostResolved(posting);
//        postings.remove(posting);
//    }

    // Handling message
//    public void sendMessageToPosting(User user, Posting posting, Message message) {
//        user.sendMessage(posting, message);
//        posting.setStatusInCommunication();
//        posting.receiveMessage(message);
//    }
}
