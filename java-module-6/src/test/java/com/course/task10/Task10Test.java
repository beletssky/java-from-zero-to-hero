package com.course.task10;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10Test {

  @Test
  void page_returnsFirstPage() {
    Task10 p = new Task10();
    List<String> input = List.of("a", "b", "c", "d", "e");
    assertEquals(List.of("a", "b"), p.page(input, 1, 2));
  }

  @Test
  void page_returnsMiddlePage() {
    Task10 p = new Task10();
    List<String> input = List.of("a", "b", "c", "d", "e");
    assertEquals(List.of("c", "d"), p.page(input, 2, 2));
  }

  @Test
  void page_lastPageMayBeShorter() {
    Task10 p = new Task10();
    List<String> input = List.of("a", "b", "c", "d", "e");
    assertEquals(List.of("e"), p.page(input, 3, 2));
  }

  @Test
  void page_returnsEmpty_whenPageNumOutOfRange() {
    Task10 p = new Task10();
    List<String> input = List.of("a", "b", "c");
    assertEquals(List.of(), p.page(input, 5, 2));
  }

  @Test
  void page_returnsEmpty_whenInputEmpty() {
    Task10 p = new Task10();
    assertEquals(List.of(), p.page(List.of(), 1, 3));
  }

  @Test
  void page_doesNotModifyInput() {
    Task10 p = new Task10();
    List<String> input = new ArrayList<>(List.of("a", "b", "c", "d"));
    List<String> snapshot = new ArrayList<>(input);
    p.page(input, 1, 2);
    assertEquals(snapshot, input);
  }

  @Test
  void page_singlePage_containsAll_whenPageSizeLargerThanInput() {
    Task10 p = new Task10();
    List<String> input = List.of("a", "b");
    assertEquals(List.of("a", "b"), p.page(input, 1, 10));
  }
}
