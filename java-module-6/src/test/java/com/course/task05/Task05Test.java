package com.course.task05;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task05Test {

  @Test
  void add_createsPendingTask() {
    Task05 list = new Task05();
    list.add("write code");
    assertEquals(1, list.getPending().size());
    assertEquals(0, list.getDone().size());
  }

  @Test
  void markDone_setsDoneTrue() {
    Task05 list = new Task05();
    list.add("write code");
    list.add("review code");
    list.markDone(0);
    assertEquals(1, list.getDone().size());
    assertEquals(1, list.getPending().size());
    assertTrue(list.getDone().get(0).isDone());
  }

  @Test
  void getDone_returnsOnlyDoneTasks() {
    Task05 list = new Task05();
    list.add("a");
    list.add("b");
    list.add("c");
    list.markDone(1);
    List<Task> done = list.getDone();
    assertEquals(1, done.size());
    assertEquals("b", done.get(0).getTitle());
  }

  @Test
  void getPending_returnsOnlyPendingTasks() {
    Task05 list = new Task05();
    list.add("a");
    list.add("b");
    list.markDone(0);
    List<Task> pending = list.getPending();
    assertEquals(1, pending.size());
    assertEquals("b", pending.get(0).getTitle());
    assertFalse(pending.get(0).isDone());
  }

  @Test
  void clearDone_removesAllDoneTasks() {
    Task05 list = new Task05();
    list.add("a");
    list.add("b");
    list.add("c");
    list.markDone(0);
    list.markDone(2);
    list.clearDone();
    assertEquals(1, list.getPending().size());
    assertEquals(0, list.getDone().size());
    assertEquals("b", list.getPending().get(0).getTitle());
  }

  @Test
  void getDone_returnsEmpty_whenNothingDone() {
    Task05 list = new Task05();
    list.add("a");
    assertEquals(0, list.getDone().size());
  }
}
