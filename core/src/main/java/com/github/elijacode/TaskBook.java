package com.github.elijacode;

import java.util.List;

public interface TaskBook {

  boolean add(Task task);
  boolean remove(Task task);
  boolean containsCheck(Task task);
  void update(Task task);
  void getAllDetails();
  Task create();
  Task findByTitle(String title);
  List<Task> getTaskList();
}
