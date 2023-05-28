package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record User (String id, String firstName, String lastName) {

    private static List<User> authors = Arrays.asList(
            new User("user-1", "Joshua", "Bloch"),
            new User("user-2", "Douglas", "Adams"),
            new User("user-3", "Bill", "Bryson")
    );

    public static User getById(String id) {
        return authors.stream()
				.filter(author -> author.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}