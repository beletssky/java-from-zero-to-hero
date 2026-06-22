package com.course.task04;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task04Test {

  @Test
  void filterByLength_keepsOnlyLongEnough() {
    Task04 filter = new Task04();
    List<String> input = List.of("a", "bb", "ccc", "dddd");
    assertEquals(List.of("ccc", "dddd"), filter.filterByLength(input, 3));
  }

  @Test
  void filterByLength_keepsEqualLength() {
    Task04 filter = new Task04();
    List<String> input = List.of("ab", "cd", "efg");
    assertEquals(List.of("ab", "cd", "efg"), filter.filterByLength(input, 2));
  }

  @Test
  void filterByLength_returnsEmpty_whenAllShorter() {
    Task04 filter = new Task04();
    List<String> input = List.of("a", "bb");
    assertEquals(List.of(), filter.filterByLength(input, 5));
  }

  @Test
  void filterByLength_returnsEmpty_whenInputEmpty() {
    Task04 filter = new Task04();
    assertEquals(List.of(), filter.filterByLength(List.of(), 3));
  }

  @Test
  void filterByLength_doesNotModifyInput() {
    Task04 filter = new Task04();
    List<String> input = new ArrayList<>(List.of("a", "bb", "ccc"));
    List<String> snapshot = new ArrayList<>(input);
    filter.filterByLength(input, 2);
    assertEquals(snapshot, input);
  }

  @Test
  void filterByLength_acceptsAll_whenMinLenZero() {
    Task04 filter = new Task04();
    List<String> input = List.of("", "x", "yy");
    assertEquals(List.of("", "x", "yy"), filter.filterByLength(input, 0));
  }
}
