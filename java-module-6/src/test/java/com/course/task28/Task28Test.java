package com.course.task28;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Task28Test {

  private final Task28 task = new Task28();

  @Test
  void areAnagramsReturnsTrueForClassicAnagrams() {
    assertTrue(task.areAnagrams("listen", "silent"));
  }

  @Test
  void areAnagramsReturnsFalseForDifferentLengths() {
    assertFalse(task.areAnagrams("abc", "abcd"));
  }

  @Test
  void areAnagramsIgnoresCase() {
    assertTrue(task.areAnagrams("Listen", "SILENT"));
  }

  @Test
  void areAnagramsIgnoresSpaces() {
    assertTrue(task.areAnagrams("conversation", "voices rant on"));
  }

  @Test
  void areAnagramsReturnsTrueWhenBothEmpty() {
    assertTrue(task.areAnagrams("", ""));
  }

  @Test
  void areAnagramsReturnsFalseForDifferentLetters() {
    assertFalse(task.areAnagrams("abc", "abd"));
  }

  @Test
  void areAnagramsReturnsFalseWhenSameLettersDifferentCounts() {
    assertFalse(task.areAnagrams("aab", "abb"));
  }

  @Test
  void areAnagramsTreatsSpacesOnlyStringsAsEmpty() {
    assertTrue(task.areAnagrams("   ", ""));
  }
}
