package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task32Test {

  @Test
  void firstGreaterThan_returnsFirstMatchWhenExists() {
    assertEquals(Optional.of(5), Task32.firstGreaterThan(List.of(1, 5, 3, 8), 4));
  }

  @Test
  void firstGreaterThan_returnsEmptyWhenNoMatch() {
    assertEquals(Optional.empty(), Task32.firstGreaterThan(List.of(1, 2, 3), 10));
  }

  @Test
  void firstGreaterThan_returnsEmptyForEmptyInput() {
    assertEquals(Optional.empty(), Task32.firstGreaterThan(List.of(), 0));
  }

  @Test
  void firstGreaterThan_returnsElementWhenSingleMatch() {
    assertEquals(Optional.of(7), Task32.firstGreaterThan(List.of(7), 5));
  }

  @Test
  void firstGreaterThan_returnsEmptyWhenSingleElementNotMatching() {
    assertEquals(Optional.empty(), Task32.firstGreaterThan(List.of(3), 5));
  }

  @Test
  void firstGreaterThan_strictlyGreaterExcludesEqual() {
    assertEquals(Optional.of(6), Task32.firstGreaterThan(List.of(5, 5, 6, 7), 5));
  }

  @Test
  void firstGreaterThan_returnsFirstOfAllMatching() {
    assertEquals(Optional.of(10), Task32.firstGreaterThan(List.of(10, 20, 30), 5));
  }
}
