package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task30Test {

  @Test
  void countStartingWith_countsWordsWithPrefix() {
    assertEquals(2L, Task30.countStartingWith(List.of("apple", "ant", "banana"), "a"));
  }

  @Test
  void countStartingWith_returnsZeroForEmptyInput() {
    assertEquals(0L, Task30.countStartingWith(List.of(), "a"));
  }

  @Test
  void countStartingWith_returnsOneForSingleMatchingElement() {
    assertEquals(1L, Task30.countStartingWith(List.of("apple"), "app"));
  }

  @Test
  void countStartingWith_returnsZeroWhenNoMatches() {
    assertEquals(0L, Task30.countStartingWith(List.of("apple", "ant"), "z"));
  }

  @Test
  void countStartingWith_returnsAllWhenAllMatch() {
    assertEquals(3L, Task30.countStartingWith(List.of("abc", "abd", "abz"), "ab"));
  }

  @Test
  void countStartingWith_isCaseSensitive() {
    assertEquals(1L, Task30.countStartingWith(List.of("apple", "Apple", "APPLE"), "a"));
  }

  @Test
  void countStartingWith_emptyPrefixMatchesAll() {
    assertEquals(3L, Task30.countStartingWith(List.of("a", "b", "c"), ""));
  }

  @Test
  void countStartingWith_doesNotModifyInput() {
    List<String> input = new ArrayList<>(List.of("apple", "ant"));
    List<String> snapshot = new ArrayList<>(input);
    Task30.countStartingWith(input, "a");
    assertEquals(snapshot, input);
  }
}
