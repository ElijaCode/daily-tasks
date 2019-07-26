package com.github.elijacode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TaskBookImplTest {

  // == fields ==
  private TaskBook taskBook;

  @Before
  public void setup() {
    taskBook = new TaskBookImpl();
  }

  @Test
  public void testAdd() {
    Task task = new TaskImpl("Cook", "Dinner at 7PM");
    assertTrue(taskBook.add(task));
  }

  @Test
  public void testRemove() {
    Task task = new TaskImpl("Walk dog", "5PM");
    assertFalse(taskBook.remove(task));
    taskBook.add(task);
    assertTrue(taskBook.remove(task));
  }

  @Test
  public void testContainsCheck() {
    Task task = new TaskImpl("Clean", "Tidy up 8PM");
    assertFalse(taskBook.containsCheck(task));
    taskBook.add(task);
    assertTrue(taskBook.containsCheck(task));
  }

  @Test
  public void testFindByTitle() {
    Task task = new TaskImpl("Exercise", "Go for a run 6:30AM");
    assertNull(taskBook.findByTitle("Exercise"));
    taskBook.add(task);
    assertEquals(task, taskBook.findByTitle("Exercise"));
  }

  @Test
  public void testGetTaskList() {
    Task task0 = new TaskImpl("Study", "Study db");
    Task task1 = new TaskImpl("Refactor", "Consolidate code");
    taskBook.add(task0);
    taskBook.add(task1);
    List<Task> tasks = Arrays.asList(task0, task1);
    assertEquals(tasks, taskBook.getTaskList());
  }
}