package com.course.task01;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task01Test {

  @Test
  void add_increasesSize() {
    Task01 list = new Task01();
    list.add("apple");
    list.add("banana");
    assertEquals(2, list.size());
  }

  @Test
  void getAll_returnsCopy_mutationDoesNotAffectInternalState() {
    Task01 list = new Task01();
    list.add("apple");
    List<String> copy = list.getAll();
    copy.add("banana");
    assertEquals(1, list.size());
    assertEquals(List.of("apple"), list.getAll());
  }

  @Test
  void contains_returnsTrue_whenPresent() {
    Task01 list = new Task01();
    list.add("apple");
    assertTrue(list.contains("apple"));
  }

  @Test
  void contains_returnsFalse_whenAbsent() {
    Task01 list = new Task01();
    list.add("apple");
    assertFalse(list.contains("banana"));
  }

  @Test
  void remove_removesFirstOccurrence() {
    Task01 list = new Task01();
    list.add("apple");
    list.add("banana");
    list.add("apple");
    list.remove("apple");
    assertEquals(List.of("banana", "apple"), list.getAll());
  }

  @Test
  void size_isZero_whenEmpty() {
    Task01 list = new Task01();
    assertEquals(0, list.size());
  }
}
