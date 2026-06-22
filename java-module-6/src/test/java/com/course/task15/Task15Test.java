package com.course.task15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class Task15Test {

  @Test
  void allReturnsTagsInAlphabeticalOrder() {
    Task15 t = new Task15();
    t.add("banana");
    t.add("apple");
    t.add("cherry");
    assertEquals(List.of("apple", "banana", "cherry"), t.all());
  }

  @Test
  void duplicateAddsAreCollapsed() {
    Task15 t = new Task15();
    t.add("a");
    t.add("a");
    t.add("b");
    assertEquals(List.of("a", "b"), t.all());
  }

  @Test
  void firstReturnsAlphabeticallySmallest() {
    Task15 t = new Task15();
    t.add("zebra");
    t.add("apple");
    t.add("mango");
    assertEquals("apple", t.first());
  }

  @Test
  void lastReturnsAlphabeticallyLargest() {
    Task15 t = new Task15();
    t.add("zebra");
    t.add("apple");
    t.add("mango");
    assertEquals("zebra", t.last());
  }

  @Test
  void firstOnEmptyThrowsNoSuchElementException() {
    Task15 t = new Task15();
    assertThrows(NoSuchElementException.class, t::first);
  }

  @Test
  void lastOnEmptyThrowsNoSuchElementException() {
    Task15 t = new Task15();
    assertThrows(NoSuchElementException.class, t::last);
  }

  @Test
  void allOnEmptyReturnsEmptyList() {
    Task15 t = new Task15();
    assertEquals(List.of(), t.all());
  }
}
