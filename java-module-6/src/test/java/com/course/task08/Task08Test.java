package com.course.task08;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task08Test {

  @Test
  void merge_equalLengthLists_interleaves() {
    Task08 m = new Task08();
    assertEquals(List.of(1, 10, 2, 20, 3, 30),
        m.merge(List.of(1, 2, 3), List.of(10, 20, 30)));
  }

  @Test
  void merge_firstLonger_appendsRemainder() {
    Task08 m = new Task08();
    assertEquals(List.of(1, 10, 2, 20, 3),
        m.merge(List.of(1, 2, 3), List.of(10, 20)));
  }

  @Test
  void merge_secondLonger_appendsRemainder() {
    Task08 m = new Task08();
    assertEquals(List.of(1, 10, 2, 20, 30, 40),
        m.merge(List.of(1, 2), List.of(10, 20, 30, 40)));
  }

  @Test
  void merge_firstEmpty_returnsSecond() {
    Task08 m = new Task08();
    assertEquals(List.of(10, 20, 30),
        m.merge(List.of(), List.of(10, 20, 30)));
  }

  @Test
  void merge_secondEmpty_returnsFirst() {
    Task08 m = new Task08();
    assertEquals(List.of(1, 2, 3),
        m.merge(List.of(1, 2, 3), List.of()));
  }

  @Test
  void merge_bothEmpty_returnsEmpty() {
    Task08 m = new Task08();
    assertEquals(List.of(), m.merge(List.of(), List.of()));
  }
}
