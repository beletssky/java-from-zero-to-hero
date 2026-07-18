package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Task46Test {

  @Test
  void flatten_concatenatesNestedListsInOrder() {
    assertEquals(
        List.of(1, 2, 3, 4, 5, 6),
        Task46.flatten(List.of(List.of(1, 2), List.of(3), List.of(4, 5, 6))));
  }

  @Test
  void flatten_returnsEmptyListForEmptyTopLevel() {
    assertEquals(List.of(), Task46.flatten(List.of()));
  }

  @Test
  void flatten_returnsEmptyListWhenAllInnerListsAreEmpty() {
    assertEquals(List.of(), Task46.flatten(List.of(List.of(), List.of(), List.of())));
  }

  @Test
  void flatten_handlesSingleInnerList() {
    assertEquals(List.of(42), Task46.flatten(List.of(List.of(42))));
  }

  @Test
  void flatten_keepsDuplicatesAndOrder() {
    assertEquals(
        List.of(1, 1, 2, 2, 3),
        Task46.flatten(List.of(List.of(1, 1), List.of(2), List.of(2, 3))));
  }

  @Test
  void flatten_skipsEmptyInnerListsBetweenNonEmpty() {
    assertEquals(
        List.of(1, 2, 3),
        Task46.flatten(List.of(List.of(1), List.of(), List.of(2, 3), List.of())));
  }
}
