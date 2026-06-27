package com.course.task24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task24Test {

  private final Task24 task = new Task24();

  @Test
  void groupByLengthBucketsStringsByLength() {
    List<String> input = List.of("a", "bb", "cc", "ddd");
    Map<Integer, List<String>> expected = Map.of(
        1, List.of("a"),
        2, List.of("bb", "cc"),
        3, List.of("ddd"));
    assertEquals(expected, task.groupByLength(input));
  }

  @Test
  void groupByLengthReturnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), task.groupByLength(List.of()));
  }

  @Test
  void groupByLengthPreservesInputOrderWithinBucket() {
    List<String> input = List.of("zz", "aa", "bb");
    Map<Integer, List<String>> result = task.groupByLength(input);
    assertEquals(List.of("zz", "aa", "bb"), result.get(2));
  }

  @Test
  void groupByLengthHandlesEmptyString() {
    Map<Integer, List<String>> result = task.groupByLength(List.of(""));
    assertEquals(Map.of(0, List.of("")), result);
  }

  @Test
  void groupByLengthDoesNotModifyInputList() {
    List<String> input = new ArrayList<>(List.of("a", "bb", "cc"));
    List<String> snapshot = new ArrayList<>(input);
    task.groupByLength(input);
    assertEquals(snapshot, input);
  }

  @Test
  void groupByLengthSingleBucketWhenAllSameLength() {
    Map<Integer, List<String>> result = task.groupByLength(List.of("ab", "cd", "ef"));
    assertEquals(Map.of(2, List.of("ab", "cd", "ef")), result);
  }
}
