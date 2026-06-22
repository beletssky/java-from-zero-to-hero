package com.course.task11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Task11Test {

  private final Task11 task = new Task11();

  @Test
  void uniqueReturnsDistinctElementsFromListWithDuplicates() {
    List<String> input = List.of("a", "b", "a", "c", "b");
    assertEquals(Set.of("a", "b", "c"), task.unique(input));
  }

  @Test
  void uniqueReturnsEmptySetForEmptyList() {
    assertEquals(Set.of(), task.unique(List.of()));
  }

  @Test
  void uniqueReturnsAllElementsWhenAllDistinct() {
    assertEquals(Set.of("x", "y", "z"), task.unique(List.of("x", "y", "z")));
  }

  @Test
  void uniqueDoesNotModifyInputList() {
    List<String> input = new ArrayList<>(List.of("a", "b", "a"));
    List<String> snapshot = new ArrayList<>(input);
    task.unique(input);
    assertEquals(snapshot, input);
  }

  @Test
  void uniqueSingleElementListProducesSingletonSet() {
    Set<String> result = task.unique(List.of("only"));
    assertEquals(Set.of("only"), result);
    assertTrue(result.contains("only"));
  }

  @Test
  void uniqueReturnsNewSetInstance() {
    Set<String> a = task.unique(List.of("a"));
    Set<String> b = task.unique(List.of("a"));
    assertNotSame(a, b);
  }
}
