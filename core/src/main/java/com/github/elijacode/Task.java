package com.github.elijacode;

import java.time.LocalDateTime;

public interface Task {
  void setTitle(String title);
  void setDescription(String description);
  String getTitle();
  String getDescription();
  LocalDateTime getCreationDate();
}
