package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task23Test {

  @Test
  void evens_returnsOnlyEvenNumbersPreservingOrder() {
    assertEquals(List.of(2, 4, 6), Task23.evens(List.of(1, 2, 3, 4, 5, 6)));
  }

  @Test
  void evens_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task23.evens(List.of()));
  }

  @Test
  void evens_returnsSingleElementWhenItIsEven() {
    assertEquals(List.of(2), Task23.evens(List.of(2)));
  }

  @Test
  void evens_returnsEmptyWhenNoEvens() {
    assertEquals(List.of(), Task23.evens(List.of(1, 3, 5, 7)));
  }

  @Test
  void evens_returnsAllWhenAllEven() {
    assertEquals(List.of(2, 4, 6, 8), Task23.evens(List.of(2, 4, 6, 8)));
  }

  @Test
  void evens_treatsZeroAsEven() {
    assertEquals(List.of(0, 2), Task23.evens(List.of(0, 1, 2, 3)));
  }

  @Test
  void evens_treatsNegativeEvenAsEven() {
    assertEquals(List.of(-4, -2, 0, 2), Task23.evens(List.of(-4, -3, -2, -1, 0, 1, 2)));
  }

  @Test
  void evens_doesNotModifyInput() {
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4));
    List<Integer> snapshot = new ArrayList<>(input);
    Task23.evens(input);
    assertEquals(snapshot, input);
  }
}
