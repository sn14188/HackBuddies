package com.yourcompany.app.server;

import com.yourcompany.app.model.HackBuddies;
import com.yourcompany.app.model.Posting;
import com.yourcompany.app.model.User;
import spark.ModelAndView;
import spark.Spark;

import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.yourcompany.app.model.Posting.Channel.NEW_HACKS_2024;
import static com.yourcompany.app.model.User.StudyLevel.COLLEGE;
import static spark.Spark.*;

public class ApplicationServer {
    public static void init() {
        port(4321);
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");

        Spark.staticFileLocation("/public");
        setUp();
    }


    private static void setUp() {
        HackBuddies hb = new HackBuddies();

        User user = new User("testuser", COLLEGE, 1);
        hb.createPosting(user, "post",  NEW_HACKS_2024, 3, "111");

        get("/post", (req, res) -> {
            // Get the current post content
            ArrayList<Posting> curposts = hb.getPostings();

            Posting p = curposts.get(0);

            Map<String, Object> map = new HashMap<>();
            map.put("postName", p.getName());

            // Return the HTML content
            return new ModelAndView(map, "mainpage.ftl");
        }, new FreeMarkerEngine());
    }

}
