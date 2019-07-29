package com.github.elijacode;

public class TaskManager {

  // == public static methods ==
  public static Task create() {
    MessageGenerator.promptTitle();
    String title = Input.getString();
    MessageGenerator.promptDescription();
    String description = Input.getString();

    return new TaskImpl(title, description);
  }

  public static void changeDetails(Task task) {
    MessageGenerator.promptTitle();
    task.setTitle(Input.getString());
    MessageGenerator.promptDescription();
    task.setDescription(Input.getString());
  }
}
