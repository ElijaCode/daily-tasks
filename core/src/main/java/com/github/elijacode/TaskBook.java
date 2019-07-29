package com.github.elijacode;

import java.util.List;

public interface TaskBook {

  boolean add(Task task);
  boolean remove(Task task);
  boolean contains(Task task);
  void update(Task task);
  Task create();
  Task selectTask();
  Task findByTitle(String title);
  List<Task> getTaskList();

}
