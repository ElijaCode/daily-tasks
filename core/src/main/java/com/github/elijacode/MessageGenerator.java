package com.github.elijacode;

import java.util.List;

public interface MessageGenerator {

  void displayTaskInfo(Task task);
  void displayAllTasks(List<Task> tasks);
  void promptTaskTitle();
  void promptTaskDescription();
}
