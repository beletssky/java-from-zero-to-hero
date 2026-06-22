package com.course.task22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;
import org.junit.jupiter.api.Test;

class Task22Test {

  private final Task22 task = new Task22();

  @Test
  void countCharsReturnsFrequencyMap() {
    assertEquals(Map.of('a', 2, 'b', 1, 'c', 1), task.countChars("aabc"));
  }

  @Test
  void countCharsSkipsSpaces() {
    assertEquals(Map.of('a', 2, 'b', 1), task.countChars("a a b"));
  }

  @Test
  void countCharsReturnsEmptyMapForEmptyString() {
    assertEquals(Map.of(), task.countChars(""));
  }

  @Test
  void countCharsReturnsEmptyMapForStringOfOnlySpaces() {
    assertEquals(Map.of(), task.countChars("    "));
  }

  @Test
  void countCharsThrowsOnNullInput() {
    assertThrows(IllegalArgumentException.class, () -> task.countChars(null));
  }

  @Test
  void countCharsIsCaseSensitive() {
    assertEquals(Map.of('A', 1, 'a', 2), task.countChars("Aaa"));
  }
}
