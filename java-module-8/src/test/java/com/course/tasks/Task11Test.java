package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task11Test {

  @Test
  void applyToEach_invokesActionOnEveryItemInOrder() {
    List<String> collected = new ArrayList<>();
    Task11.applyToEach(List.of("a", "b", "c"), collected::add);
    assertEquals(List.of("a", "b", "c"), collected);
  }

  @Test
  void applyToEach_doesNothingForEmptyList() {
    List<String> collected = new ArrayList<>();
    Task11.applyToEach(List.of(), collected::add);
    assertEquals(List.of(), collected);
  }

  @Test
  void applyToEach_appendsAllToStringBuilder() {
    StringBuilder sb = new StringBuilder();
    Task11.applyToEach(List.of("x", "y", "z"), sb::append);
    assertEquals("xyz", sb.toString());
  }

  @Test
  void applyToEach_fireExactlyOncePerItem() {
    List<String> collected = new ArrayList<>();
    Task11.applyToEach(List.of("a", "a", "b"), collected::add);
    assertEquals(List.of("a", "a", "b"), collected);
    assertEquals(3, collected.size());
  }

  @Test
  void applyToEach_appliesActionToSingleElement() {
    List<String> collected = new ArrayList<>();
    Task11.applyToEach(List.of("only"), collected::add);
    assertEquals(List.of("only"), collected);
  }
}
