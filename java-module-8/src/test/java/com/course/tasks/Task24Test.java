package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task24Test {

  @Test
  void squares_returnsSquaresOfNumbersInOrder() {
    assertEquals(List.of(1, 4, 9, 16), Task24.squares(List.of(1, 2, 3, 4)));
  }

  @Test
  void squares_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task24.squares(List.of()));
  }

  @Test
  void squares_returnsSingleSquaredForSingleElement() {
    assertEquals(List.of(25), Task24.squares(List.of(5)));
  }

  @Test
  void squares_squaresNegativeNumbersToPositive() {
    assertEquals(List.of(9, 4, 1), Task24.squares(List.of(-3, -2, -1)));
  }

  @Test
  void squares_squaresZeroToZero() {
    assertEquals(List.of(0, 1, 0), Task24.squares(List.of(0, 1, 0)));
  }

  @Test
  void squares_preservesDuplicatesAndOrder() {
    assertEquals(List.of(4, 4, 1), Task24.squares(List.of(2, 2, 1)));
  }

  @Test
  void squares_doesNotModifyInput() {
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
    List<Integer> snapshot = new ArrayList<>(input);
    Task24.squares(input);
    assertEquals(snapshot, input);
  }
}
