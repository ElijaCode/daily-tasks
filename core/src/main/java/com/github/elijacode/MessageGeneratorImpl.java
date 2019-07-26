package com.github.elijacode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MessageGeneratorImpl implements MessageGenerator {

  // == constants ==
  private static final Logger log =
      LoggerFactory.getLogger(MessageGeneratorImpl.class);

  // == public methods ==
  @Override
  public void displayTaskInfo(Task task) {
    log.info(task.toString());
  }

  @Override
  public void displayAllTasks(List<Task>tasks) {
    tasks.forEach(task -> log.info(task.toString()));
  }

  @Override
  public void promptTaskTitle() {
    log.info("Enter task title: ");
  }

  @Override
  public void promptTaskDescription() {
    log.info("Enter task description: ");
  }
}
