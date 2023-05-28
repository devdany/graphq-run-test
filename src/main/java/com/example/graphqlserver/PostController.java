package com.example.graphqlserver;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.example.graphqlserver.inputs.CreatePostInput;
import com.example.graphqlserver.inputs.UpdatePostInput;

@Controller
public class PostController {
  @QueryMapping
  public Post post(@Argument String id) {
    return Post.getById(id);
  }

  @QueryMapping
  public List<Post> posts() {
    return Post.getAll();
  }

  @SchemaMapping
  public User writer(Post post) {
    return User.getById(post.writerId());
  }


  @MutationMapping
  public Post createPost(@Argument CreatePostInput data) {
    Post createdPost = new Post(Post.generateNewPostId(), data.getTitle(), data.getContent(), data.getWriterId());
    Post.appendPost(createdPost);
    return createdPost;
  }

  @MutationMapping
  public Post updatePost(@Argument String id, @Argument UpdatePostInput data) {
    Post post = Post.getById(id);
    if (post == null) {
      return null;
    }

    Post updatedPost = new Post(id, post.title(), data.content(), post.writerId());
    Post.updatePost(updatedPost);
    return updatedPost;
  }
}
