package com.example.graphqlserver.inputs;

public class CreatePostInput {
  private String title;
  private String content;
  private String writerId;

  public CreatePostInput(String title, String content, String writerId) {
    this.title = title;
    this.content = content;
    this.writerId = writerId;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public String getWriterId() {
    return writerId;
  }
}
