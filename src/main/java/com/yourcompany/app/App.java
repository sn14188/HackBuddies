package com.yourcompany.app;

import com.yourcompany.app.server.ApplicationServer;

public class App {
    public static void main( String[] args ) {
        System.out.println("Starting server...");
        ApplicationServer.init();
        System.out.println("Server is running...");
    }
}
