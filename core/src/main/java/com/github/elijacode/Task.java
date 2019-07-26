package com.github.elijacode;

public interface Task {
  void setTitle(String title);
  void setDescription(String description);
  String getTitle();
  String getDescription();
  String getCreationDate();
}
