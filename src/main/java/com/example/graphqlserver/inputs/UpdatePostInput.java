package com.example.graphqlserver.inputs;

public class UpdatePostInput {
  String content;

  public UpdatePostInput(String content) {
    this.content = content;
  }

  public String content() {
    return content;
  }
}
