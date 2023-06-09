package com.example.graphqlserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Post (String id, String title, String content, String writerId) {

    private static List<Post> posts = new ArrayList<Post>(Arrays.asList(
        new Post("post-1", "Good Post",  "It is a good post", "user-1"),
        new Post("post-2", "Bad Post", "It is a bad post", "user-2"),
        new Post("post-3", "Nice Post", "It is a nice post", "user-3")
    ));

    public static List<Post> getAll() {
        return posts;
    }
}