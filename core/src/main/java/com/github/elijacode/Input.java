package com.github.elijacode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
  private static Scanner input =
      new Scanner(System.in);

  public static int getInt() {
    int userInput = 0;
    try {
      userInput = input.nextInt();
    } catch(InputMismatchException ime) {
      MessageGenerator.invalidInput();
    } finally {
      input.nextLine();
    }
    return userInput;
  }

  public static String getString() {
    return input.nextLine();
  }

}
