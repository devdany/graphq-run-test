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

    public static Post getById(String id) {
        return posts.stream()
				.filter(post -> post.id().equals(id))
				.findFirst()
				.orElse(null);
    }

    public static List<Post> getAll() {
        return posts;
    }

    public static Post appendPost(Post post) {
        posts.add(post);
        return post;
    }

    public static Post updatePost(Post post) {
        Post oldPost = getById(post.id());
        posts.remove(oldPost);
        posts.add(post);
        return post;
    }

    public static String generateNewPostId() {
        return "post-" + (posts.size() + 1);
    }
}