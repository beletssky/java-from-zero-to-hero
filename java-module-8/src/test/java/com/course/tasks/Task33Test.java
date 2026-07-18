package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Task33Test {

  @Test
  void totalLength_returnsSumOfAllStringLengths() {
    assertEquals(6, Task33.totalLength(List.of("ab", "cde", "f")));
  }

  @Test
  void totalLength_returnsZeroForEmptyInput() {
    assertEquals(0, Task33.totalLength(List.of()));
  }

  @Test
  void totalLength_returnsLengthForSingleElement() {
    assertEquals(5, Task33.totalLength(List.of("hello")));
  }

  @Test
  void totalLength_returnsZeroWhenAllEmptyStrings() {
    assertEquals(0, Task33.totalLength(List.of("", "", "")));
  }

  @Test
  void totalLength_ignoresEmptyStringsWithinList() {
    assertEquals(3, Task33.totalLength(List.of("", "abc", "")));
  }

  @Test
  void totalLength_sumsLargeNumberOfElements() {
    assertEquals(10, Task33.totalLength(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")));
  }
}
