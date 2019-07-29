package com.github.elijacode;

public interface Task {
  void setTitle(String title);
  void setDescription(String description);
  void setComplete(boolean isComplete);
  boolean isComplete();
  String getTitle();
  String getDescription();
  String getCreationDate();
}
