package com.github.elijacode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TaskImplTest {

  @Test
  public void testGetCreationDate() {
    Task task = new TaskImpl("Test", "Test123");
    String creationDate = LocalDateTime.now()
        .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

    assertEquals(creationDate, task.getCreationDate());
  }

}