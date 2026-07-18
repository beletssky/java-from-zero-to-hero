package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task45Test {

  @Test
  void wordFrequency_countsRepeatedWords() {
    Map<String, Long> result =
        Task45.wordFrequency(List.of("a", "b", "a", "c", "a"));

    assertEquals(3, result.size());
    assertEquals(3L, result.get("a"));
    assertEquals(1L, result.get("b"));
    assertEquals(1L, result.get("c"));
  }

  @Test
  void wordFrequency_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task45.wordFrequency(List.of()));
  }

  @Test
  void wordFrequency_singleWordProducesCountOne() {
    Map<String, Long> result = Task45.wordFrequency(List.of("only"));

    assertEquals(1, result.size());
    assertEquals(1L, result.get("only"));
  }

  @Test
  void wordFrequency_allUniqueWordsEachHaveCountOne() {
    Map<String, Long> result =
        Task45.wordFrequency(List.of("a", "b", "c", "d"));

    assertEquals(4, result.size());
    assertEquals(1L, result.get("a"));
    assertEquals(1L, result.get("b"));
    assertEquals(1L, result.get("c"));
    assertEquals(1L, result.get("d"));
  }

  @Test
  void wordFrequency_allSameWordProducesSingleKeyWithFullCount() {
    Map<String, Long> result =
        Task45.wordFrequency(List.of("hi", "hi", "hi", "hi"));

    assertEquals(1, result.size());
    assertEquals(4L, result.get("hi"));
  }

  @Test
  void wordFrequency_isCaseSensitive() {
    Map<String, Long> result =
        Task45.wordFrequency(List.of("Hi", "hi", "HI"));

    assertEquals(3, result.size());
    assertEquals(1L, result.get("Hi"));
    assertEquals(1L, result.get("hi"));
    assertEquals(1L, result.get("HI"));
    assertFalse(result.containsKey("hI"));
  }
}
