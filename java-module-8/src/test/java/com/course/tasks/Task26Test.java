package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task26Test {

  @Test
  void sorted_returnsWordsInAlphabeticalOrder() {
    assertEquals(
        List.of("apple", "banana", "cherry"),
        Task26.sorted(List.of("banana", "apple", "cherry")));
  }

  @Test
  void sorted_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task26.sorted(List.of()));
  }

  @Test
  void sorted_returnsSingleElementUnchanged() {
    assertEquals(List.of("hello"), Task26.sorted(List.of("hello")));
  }

  @Test
  void sorted_returnsAlreadySortedListUnchanged() {
    assertEquals(List.of("a", "b", "c"), Task26.sorted(List.of("a", "b", "c")));
  }

  @Test
  void sorted_keepsDuplicatesInResult() {
    assertEquals(List.of("a", "a", "b"), Task26.sorted(List.of("b", "a", "a")));
  }

  @Test
  void sorted_doesNotModifyInput() {
    List<String> input = new ArrayList<>(List.of("banana", "apple", "cherry"));
    List<String> snapshot = new ArrayList<>(input);
    Task26.sorted(input);
    assertEquals(snapshot, input);
  }
}
