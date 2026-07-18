package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task01Test {

  @Test
  void sortsMixedStringsByLengthAscending() {
    List<String> input = new ArrayList<>(List.of("abc", "a", "ab"));
    input.sort(Task01.byLength());
    assertEquals(List.of("a", "ab", "abc"), input);
  }

  @Test
  void emptyListRemainsEmpty() {
    List<String> input = new ArrayList<>();
    input.sort(Task01.byLength());
    assertTrue(input.isEmpty());
  }

  @Test
  void singleElementListUnchanged() {
    List<String> input = new ArrayList<>(List.of("hello"));
    input.sort(Task01.byLength());
    assertEquals(List.of("hello"), input);
  }

  @Test
  void stableForEqualLengths() {
    Comparator<String> cmp = Task01.byLength();
    assertEquals(0, cmp.compare("ab", "cd"));
  }

  @Test
  void directComparePositiveAndNegative() {
    Comparator<String> cmp = Task01.byLength();
    assertTrue(cmp.compare("a", "abc") < 0);
    assertTrue(cmp.compare("abcd", "ab") > 0);
  }

  @Test
  void handlesEmptyStringAsShortest() {
    List<String> input = new ArrayList<>(List.of("xx", "", "x"));
    input.sort(Task01.byLength());
    assertEquals(List.of("", "x", "xx"), input);
  }
}
