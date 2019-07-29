package com.github.elijacode;

public class MenuImpl implements Menu {

  // == fields ==
  private TaskBook taskBook;

  // == constructor ==
  public MenuImpl() {
    taskBook = new TaskBookImpl();
  }

  // == public methods ==
  @Override
  public int mainMenu() {
    MessageGenerator.mainMenuOptions();
    int userInput = Input.getInt();
    switch(userInput) {
      case 1:
        MessageGenerator
            .displayAllTasks(taskBook.getTaskList());
        break;
      case 2:
        MessageGenerator.addTask();
        taskBook.add(taskBook.create());
        break;
      case 3:
        // run task menu until exit code entered (5)
        while(taskMenu() != TASK_EXIT){ }
        break;
      case 4:
        MessageGenerator.exit();
        break;
    }
    return userInput;
  }

  @Override
  public int taskMenu() {
    MessageGenerator.selectTask(taskBook.getTaskList());
    Task selectedTask = taskBook.selectTask();
    int userInput = TASK_EXIT;

    if (selectedTask != null) {
      MessageGenerator.taskMenuOptions();
      userInput = Input.getInt();
      switch(userInput){
        case 1:
          // do nothing, will re-run this method
          break;
        case 2:
          MessageGenerator.completeTask();
          selectedTask.setComplete(true);
          break;
        case 3:
          MessageGenerator.updateTask();
          taskBook.update(selectedTask);
          break;
        case 4:
          MessageGenerator.removeTask();
          taskBook.remove(selectedTask);
          break;
        case 5:
          // do nothing, will exit this method
          break;
      }
    }
    return userInput;
  }


}
