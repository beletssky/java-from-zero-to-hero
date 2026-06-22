package com.course.task02;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task02Test {

  @Test
  void sum_returnsTotalOfAddedNumbers() {
    Task02 stats = new Task02();
    stats.add(1);
    stats.add(2);
    stats.add(3);
    assertEquals(6, stats.sum());
  }

  @Test
  void average_returnsZero_whenEmpty() {
    Task02 stats = new Task02();
    assertEquals(0.0, stats.average());
  }

  @Test
  void average_returnsMean_whenNotEmpty() {
    Task02 stats = new Task02();
    stats.add(2);
    stats.add(4);
    assertEquals(3.0, stats.average());
  }

  @Test
  void max_returnsLargestValue() {
    Task02 stats = new Task02();
    stats.add(5);
    stats.add(10);
    stats.add(3);
    assertEquals(10, stats.max());
  }

  @Test
  void min_returnsSmallestValue() {
    Task02 stats = new Task02();
    stats.add(5);
    stats.add(10);
    stats.add(3);
    assertEquals(3, stats.min());
  }

  @Test
  void max_throws_whenEmpty() {
    Task02 stats = new Task02();
    assertThrows(NoSuchElementException.class, stats::max);
  }

  @Test
  void min_throws_whenEmpty() {
    Task02 stats = new Task02();
    assertThrows(NoSuchElementException.class, stats::min);
  }

  @Test
  void sum_isZero_whenEmpty() {
    Task02 stats = new Task02();
    assertEquals(0, stats.sum());
  }
}
