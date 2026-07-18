package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task28Test {

  @Test
  void distinctOrdered_removesDuplicatesPreservingFirstOccurrenceOrder() {
    assertEquals(List.of("a", "b", "c"), Task28.distinctOrdered(List.of("a", "b", "a", "c", "b")));
  }

  @Test
  void distinctOrdered_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task28.distinctOrdered(List.of()));
  }

  @Test
  void distinctOrdered_returnsSingleElementUnchanged() {
    assertEquals(List.of("only"), Task28.distinctOrdered(List.of("only")));
  }

  @Test
  void distinctOrdered_returnsSingleElementWhenAllDuplicates() {
    assertEquals(List.of("x"), Task28.distinctOrdered(List.of("x", "x", "x", "x")));
  }

  @Test
  void distinctOrdered_returnsAllWhenNoDuplicates() {
    assertEquals(List.of("a", "b", "c", "d"), Task28.distinctOrdered(List.of("a", "b", "c", "d")));
  }

  @Test
  void distinctOrdered_isCaseSensitive() {
    assertEquals(List.of("a", "A"), Task28.distinctOrdered(List.of("a", "A", "a")));
  }

  @Test
  void distinctOrdered_doesNotModifyInput() {
    List<String> input = new ArrayList<>(List.of("a", "b", "a"));
    List<String> snapshot = new ArrayList<>(input);
    Task28.distinctOrdered(input);
    assertEquals(snapshot, input);
  }
}
