package com.course.task29;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

  @Test
  void removesShortStringsKeepsLongOnes() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>(List.of("a", "bb", "ccc", "dddd"));
    t.removeShort(list, 3);
    assertEquals(List.of("ccc", "dddd"), list);
  }

  @Test
  void removesAllWhenAllShorter() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>(List.of("a", "bb"));
    t.removeShort(list, 5);
    assertTrue(list.isEmpty());
  }

  @Test
  void keepsAllWhenAllLongEnough() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>(List.of("hello", "world", "java"));
    t.removeShort(list, 3);
    assertEquals(List.of("hello", "world", "java"), list);
  }

  @Test
  void emptyListStaysEmpty() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>();
    t.removeShort(list, 3);
    assertTrue(list.isEmpty());
  }

  @Test
  void minLenZeroKeepsEverythingIncludingEmptyStrings() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>(List.of("", "a", "bb"));
    t.removeShort(list, 0);
    assertEquals(List.of("", "a", "bb"), list);
  }

  @Test
  void boundaryMinLenEqualsLengthIsKept() {
    Task29 t = new Task29();
    List<String> list = new ArrayList<>(List.of("ab", "abc", "abcd"));
    t.removeShort(list, 3);
    assertEquals(List.of("abc", "abcd"), list);
  }
}
