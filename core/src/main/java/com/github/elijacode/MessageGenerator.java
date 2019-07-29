package com.github.elijacode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MessageGenerator {

  // == constants ==
  private static final Logger log =
      LoggerFactory.getLogger(MessageGenerator.class);


  // == public static methods ==
  public static void displayAllTasks(List<Task>tasks) {
    if(tasks.size() > 0) {
      log.info(" == Tasks ==");
      tasks.forEach(task -> log.info(task.toString()));
    } else {
      log.info("There are currently no tasks\n");
    }
  }

  public static void mainMenuOptions() {
    log.info(" == Main Menu Options ==");
    log.info("1. Display Tasks");
    log.info("2. Add Task");
    log.info("3. View Specific Task");
    log.info("4. Exit Program");
    log.info("Select option [1-4]");
  }

  public static void taskMenuOptions() {
    log.info(" == Task Menu Options ==");
    log.info("1. Select Different Task");
    log.info("2. Set Task Completed");
    log.info("3. Update Task");
    log.info("4. Remove Task");
    log.info("5. Go Back");
  }


  public static void promptTitle() {
    log.info("Enter taskMenu title: ");
  }

  public static void promptDescription() {
    log.info("Enter taskMenu description: ");
  }

  public static void selectedMessage(Task task) {
    log.info("Selected: " + task.toString());
  }

  public static void invalidRangeSelected() {
    log.info("Invalid number range selected, try again.");
  }

  public static void invalidInput() {
    log.info("Invalid option entered, try again.");
  }

  public static void updateTask() {
    log.info("Updating taskMenu...");
  }

  public static void completeTask() {
    log.info("Task completed...");
  }

  public static void removeTask() {
    log.info("Removing taskMenu...");
  }

  public static void addTask() {
    log.info("Create & add new taskMenu...");
  }

  public static void selectTask(List<Task> taskList) {
    log.info("Task Selection");
    if(taskList.size() > 0) {
      displayAllTasks(taskList);
      log.info("Select taskMenu 0 - " + (taskList.size() - 1));
    } else {
      log.info("There are no tasks.");
    }
  }
  public static void exit() {
    log.info("Exiting application...");
  }
}
