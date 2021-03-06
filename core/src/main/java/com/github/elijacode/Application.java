package com.github.elijacode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

  private static final Logger log  =
      LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    log.info("daily-tasks");
    Menu menuOption = new MenuImpl();

    while(menuOption.mainMenu() != Menu.MAIN_EXIT) {
      // run application
    }
  }
}
