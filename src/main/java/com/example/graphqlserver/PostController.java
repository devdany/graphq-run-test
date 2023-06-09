package com.example.graphqlserver;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {
  @QueryMapping
  public List<Post> posts() {
    return Post.getAll();
  }

  @SchemaMapping
  public User writer(Post post) {
    return User.getById(post.writerId());
  }
}
