package com.yourcompany.app;

import com.yourcompany.app.model.HackBuddies;
import com.yourcompany.app.server.ApplicationServer;

public class App {
    private static final HackBuddies hackBuddies = new HackBuddies();
    public static void main( String[] args ) {
        System.out.println("Starting server...");
        ApplicationServer.init();
        System.out.println("Server is running...");
    }
}
