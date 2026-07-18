package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task03Test {

  @Test
  void sortsMixedIntegersDescending() {
    List<Integer> input = new ArrayList<>(List.of(1, 3, 2));
    input.sort(Task03.descending());
    assertEquals(List.of(3, 2, 1), input);
  }

  @Test
  void emptyListRemainsEmpty() {
    List<Integer> input = new ArrayList<>();
    input.sort(Task03.descending());
    assertTrue(input.isEmpty());
  }

  @Test
  void singleElementListUnchanged() {
    List<Integer> input = new ArrayList<>(List.of(42));
    input.sort(Task03.descending());
    assertEquals(List.of(42), input);
  }

  @Test
  void handlesNegativeAndPositive() {
    List<Integer> input = new ArrayList<>(List.of(-1, 5, 0, -10, 3));
    input.sort(Task03.descending());
    assertEquals(List.of(5, 3, 0, -1, -10), input);
  }

  @Test
  void compareReturnsCorrectSign() {
    Comparator<Integer> cmp = Task03.descending();
    assertTrue(cmp.compare(1, 2) > 0);
    assertTrue(cmp.compare(2, 1) < 0);
    assertEquals(0, cmp.compare(3, 3));
  }

  @Test
  void factoryReturnsNonNullComparator() {
    assertNotNull(Task03.descending());
  }
}
