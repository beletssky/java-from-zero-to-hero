package com.course.task20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task20Test {

  private final Task20 task = new Task20();

  @Test
  void countWordsReturnsFrequencyMapForRepeatedWords() {
    List<String> input = List.of("a", "b", "a", "c", "b", "a");
    assertEquals(Map.of("a", 3, "b", 2, "c", 1), task.countWords(input));
  }

  @Test
  void countWordsReturnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), task.countWords(List.of()));
  }

  @Test
  void countWordsReturnsOneForEachWhenAllDistinct() {
    assertEquals(Map.of("x", 1, "y", 1, "z", 1), task.countWords(List.of("x", "y", "z")));
  }

  @Test
  void countWordsDoesNotModifyInputList() {
    List<String> input = new ArrayList<>(List.of("a", "b", "a"));
    List<String> snapshot = new ArrayList<>(input);
    task.countWords(input);
    assertEquals(snapshot, input);
  }

  @Test
  void countWordsHandlesSingleWordList() {
    assertEquals(Map.of("only", 1), task.countWords(List.of("only")));
  }

  @Test
  void countWordsIsCaseSensitive() {
    assertEquals(Map.of("Java", 1, "java", 2), task.countWords(List.of("Java", "java", "java")));
  }
}
