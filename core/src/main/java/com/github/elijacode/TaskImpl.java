package com.github.elijacode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TaskImpl implements Task {

  // == fields ==
  private String title;
  private String description;
  private LocalDateTime creationDate;

  // == constructor ==
  public TaskImpl(String title, String description) {
    this.title = title;
    this.description = description;
    creationDate = LocalDateTime.now();
  }

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
  public String getCreationDate() {
    return creationDate
        .format(DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT));
  }

  @Override
  public String toString() {
    return "TaskImpl{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", creationDate=" + getCreationDate() +
        '}';
  }
}
