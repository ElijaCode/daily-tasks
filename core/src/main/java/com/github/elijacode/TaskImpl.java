package com.github.elijacode;

import java.time.LocalDateTime;

public class TaskImpl implements Task {

  // == fields ==
  private String title;
  private String description;
  private LocalDateTime creationDate;

  // == public methods
  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public LocalDateTime getCreationDate() {
    return creationDate;
  }
}
