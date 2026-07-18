package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task44Test {

  @Test
  void byWordLength_groupsWordsByLength() {
    Map<Integer, List<String>> result =
        Task44.byWordLength(List.of("a", "bb", "cc", "ddd"));

    assertEquals(3, result.size());
    assertEquals(List.of("a"), result.get(1));
    assertEquals(List.of("bb", "cc"), result.get(2));
    assertEquals(List.of("ddd"), result.get(3));
  }

  @Test
  void byWordLength_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task44.byWordLength(List.of()));
  }

  @Test
  void byWordLength_singleWordProducesSingleGroup() {
    Map<Integer, List<String>> result = Task44.byWordLength(List.of("hello"));

    assertEquals(1, result.size());
    assertEquals(List.of("hello"), result.get(5));
  }

  @Test
  void byWordLength_allSameLengthProducesSingleKey() {
    Map<Integer, List<String>> result =
        Task44.byWordLength(List.of("aaa", "bbb", "ccc"));

    assertEquals(1, result.size());
    assertEquals(List.of("aaa", "bbb", "ccc"), result.get(3));
  }

  @Test
  void byWordLength_supportsEmptyStringUnderKeyZero() {
    Map<Integer, List<String>> result =
        Task44.byWordLength(List.of("", "a", ""));

    assertEquals(List.of("", ""), result.get(0));
    assertEquals(List.of("a"), result.get(1));
    assertTrue(result.containsKey(0));
    assertTrue(result.containsKey(1));
  }
}
