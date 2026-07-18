package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class Task10Test {

  private static final Predicate<String> LEN_GT_2 = s -> s.length() > 2;

  @Test
  void keep_returnsMatchingItems() {
    assertEquals(
        List.of("ccc", "dddd"),
        Task10.keep(List.of("a", "bb", "ccc", "dddd"), LEN_GT_2));
  }

  @Test
  void keep_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task10.keep(List.of(), LEN_GT_2));
  }

  @Test
  void keep_returnsEmptyListWhenNothingMatches() {
    assertEquals(List.of(), Task10.keep(List.of("a", "bb"), LEN_GT_2));
  }

  @Test
  void keep_returnsAllItemsWhenAllMatch() {
    assertEquals(
        List.of("aaa", "bbbb"),
        Task10.keep(List.of("aaa", "bbbb"), LEN_GT_2));
  }

  @Test
  void keep_preservesOriginalOrder() {
    assertEquals(
        List.of("zzz", "aaaa", "bbb"),
        Task10.keep(List.of("zzz", "aa", "aaaa", "b", "bbb"), LEN_GT_2));
  }
}
