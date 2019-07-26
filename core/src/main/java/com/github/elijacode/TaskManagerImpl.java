package com.github.elijacode;

import java.util.Scanner;

public class TaskManagerImpl implements TaskManager {
  // == fields ==
  private MessageGenerator messageGenerator = new MessageGeneratorImpl();
  private Scanner input = new Scanner(System.in);

  // == public methods ==
  @Override
  public Task create() {
    messageGenerator.promptTaskTitle();
    String title = input.nextLine();
    messageGenerator.promptTaskDescription();
    String description = input.nextLine();
    return new TaskImpl(title, description);
  }

  @Override
  public void changeDetails(Task task) {
    messageGenerator.promptTaskTitle();
    task.setTitle(input.nextLine());
    messageGenerator.promptTaskDescription();
    task.setDescription(input.nextLine());

  }
}
