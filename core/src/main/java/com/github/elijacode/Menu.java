package com.github.elijacode;

public interface Menu {

  // == constants ==
  int CONTINUE =  0;
  int MAIN_EXIT = 4;
  int TASK_EXIT = 5;

  // == methods ==
  int mainMenu();
  int taskMenu();
}
