package com.course.task09;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task09Test {

  @Test
  void topN_returnsLargestInDescendingOrder() {
    Task09 t = new Task09();
    assertEquals(List.of(9, 7, 5),
        t.topN(List.of(1, 9, 5, 3, 7), 3));
  }

  @Test
  void topN_returnsAllSortedDesc_whenNGreaterThanSize() {
    Task09 t = new Task09();
    assertEquals(List.of(7, 5, 3, 1),
        t.topN(List.of(1, 7, 3, 5), 10));
  }

  @Test
  void topN_returnsEmpty_whenNIsZero() {
    Task09 t = new Task09();
    assertEquals(List.of(), t.topN(List.of(1, 2, 3), 0));
  }

  @Test
  void topN_returnsEmpty_whenInputEmpty() {
    Task09 t = new Task09();
    assertEquals(List.of(), t.topN(List.of(), 3));
  }

  @Test
  void topN_doesNotModifyInput() {
    Task09 t = new Task09();
    List<Integer> input = new ArrayList<>(List.of(1, 9, 5, 3, 7));
    List<Integer> snapshot = new ArrayList<>(input);
    t.topN(input, 2);
    assertEquals(snapshot, input);
  }

  @Test
  void topN_handlesDuplicates() {
    Task09 t = new Task09();
    assertEquals(List.of(5, 5, 3),
        t.topN(List.of(1, 5, 3, 5, 2), 3));
  }
}
