package com.course.task19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Task19Test {

  @Test
  void setAndGetReturnsStoredAge() {
    Task19 task = new Task19();
    task.set("Alice", 30);
    assertEquals(Integer.valueOf(30), task.get("Alice"));
  }

  @Test
  void getReturnsNullWhenNameAbsent() {
    Task19 task = new Task19();
    assertNull(task.get("Unknown"));
  }

  @Test
  void hasReturnsTrueWhenPresentFalseOtherwise() {
    Task19 task = new Task19();
    task.set("Bob", 25);
    assertTrue(task.has("Bob"));
    assertFalse(task.has("Charlie"));
  }

  @Test
  void removeDeletesEntry() {
    Task19 task = new Task19();
    task.set("Dan", 40);
    task.remove("Dan");
    assertFalse(task.has("Dan"));
    assertNull(task.get("Dan"));
  }

  @Test
  void sizeReflectsNumberOfEntries() {
    Task19 task = new Task19();
    assertEquals(0, task.size());
    task.set("A", 1);
    task.set("B", 2);
    assertEquals(2, task.size());
    task.remove("A");
    assertEquals(1, task.size());
  }

  @Test
  void setOverridesExistingAge() {
    Task19 task = new Task19();
    task.set("Eve", 20);
    task.set("Eve", 21);
    assertEquals(Integer.valueOf(21), task.get("Eve"));
    assertEquals(1, task.size());
  }
}
