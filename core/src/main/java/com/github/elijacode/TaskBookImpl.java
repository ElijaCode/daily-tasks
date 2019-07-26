package com.github.elijacode;

import java.util.ArrayList;
import java.util.List;

public class TaskBookImpl implements TaskBook {

  // == fields ==
  private List<Task> taskList;
  private TaskManager taskManager;
  private MessageGenerator messageGenerator;

  // == constructor ==
  public TaskBookImpl() {
    taskList = new ArrayList<>();
    taskManager = new TaskManagerImpl();
    messageGenerator = new MessageGeneratorImpl();
  }
  // == public methods ==
  @Override
  public boolean add(Task task){
    return taskList.add(task);
  }

  @Override
  public boolean remove(Task task) {
    return taskList.remove(task);
  }

  @Override
  public boolean containsCheck(Task task) {
    return taskList.contains(task);
  }

  @Override
  public Task findByTitle(String title) {
    return taskList.stream()
                  .filter( task -> task.getTitle().equalsIgnoreCase(title))
                  .findAny()
                  .orElse(null);
  }

  @Override
  public void update(Task task) {
    taskManager.changeDetails(task);
  }

  @Override
  public Task create() {
    return taskManager.create();
  }

  @Override
  public void getAllDetails() {
    messageGenerator.displayAllTasks(taskList);
  }

  @Override
  public List<Task> getTaskList() {
    // new so original can't be modified
    return new ArrayList<>(taskList);
  }
}
