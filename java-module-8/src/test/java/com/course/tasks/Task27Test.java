package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task27Test {

  @Test
  void sortedDesc_returnsNumbersInDescendingOrder() {
    assertEquals(
        List.of(9, 5, 4, 3, 2, 1, 1),
        Task27.sortedDesc(List.of(3, 1, 4, 1, 5, 9, 2)));
  }

  @Test
  void sortedDesc_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task27.sortedDesc(List.of()));
  }

  @Test
  void sortedDesc_returnsSingleElementUnchanged() {
    assertEquals(List.of(42), Task27.sortedDesc(List.of(42)));
  }

  @Test
  void sortedDesc_reversesAscendingInput() {
    assertEquals(List.of(3, 2, 1), Task27.sortedDesc(List.of(1, 2, 3)));
  }

  @Test
  void sortedDesc_keepsDuplicatesAdjacent() {
    assertEquals(List.of(7, 7, 5, 5, 1), Task27.sortedDesc(List.of(5, 7, 1, 5, 7)));
  }

  @Test
  void sortedDesc_handlesNegativeNumbers() {
    assertEquals(List.of(3, 0, -1, -5), Task27.sortedDesc(List.of(-1, 3, -5, 0)));
  }

  @Test
  void sortedDesc_doesNotModifyInput() {
    List<Integer> input = new ArrayList<>(List.of(3, 1, 2));
    List<Integer> snapshot = new ArrayList<>(input);
    Task27.sortedDesc(input);
    assertEquals(snapshot, input);
  }
}
