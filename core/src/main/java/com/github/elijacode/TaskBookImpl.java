package com.github.elijacode;

import java.util.ArrayList;
import java.util.List;


public class TaskBookImpl implements TaskBook {

  // == fields ==
  private List<Task> taskList;

  // == constructor ==
  public TaskBookImpl() {
    taskList = new ArrayList<>();
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
  public boolean contains(Task task) {
    return taskList.contains(task);
  }

  @Override
  public Task findByTitle(String title) {
    // calling method -- possible null
    return taskList.stream()
                  .filter( task -> task.getTitle().equalsIgnoreCase(title))
                  .findAny()
                  .orElse(null);
  }


  @Override
  public void update(Task task) {
    TaskManager.changeDetails(task);
  }

  @Override
  public Task create() {
    return TaskManager.create();
  }

  @Override
  public List<Task> getTaskList() {
    // new so original can't be modified
    return new ArrayList<>(taskList);
  }

  @Override
  public Task selectTask() {
    Task selectedTask = null;

    if(!taskList.isEmpty()) {
      int userInput = Input.getInt();
      // validate range
      if(userInput >= 0 && userInput < taskList.size()){
        selectedTask = taskList.get(userInput);
      }
    }
    return selectedTask;
  }

}
