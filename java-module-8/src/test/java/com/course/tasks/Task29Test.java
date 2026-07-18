package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task29Test {

  @Test
  void page_returnsFirstPageWhenPageIsZero() {
    assertEquals(List.of("a", "b"), Task29.page(List.of("a", "b", "c", "d", "e"), 0, 2));
  }

  @Test
  void page_returnsMiddlePage() {
    assertEquals(List.of("c", "d"), Task29.page(List.of("a", "b", "c", "d", "e"), 1, 2));
  }

  @Test
  void page_returnsPartialLastPage() {
    assertEquals(List.of("e"), Task29.page(List.of("a", "b", "c", "d", "e"), 2, 2));
  }

  @Test
  void page_returnsEmptyWhenPageBeyondData() {
    assertEquals(List.of(), Task29.page(List.of("a", "b", "c"), 5, 2));
  }

  @Test
  void page_returnsEmptyForEmptyInput() {
    assertEquals(List.of(), Task29.page(List.of(), 0, 3));
  }

  @Test
  void page_returnsSingleElementPageOfSizeOne() {
    assertEquals(List.of("b"), Task29.page(List.of("a", "b", "c"), 1, 1));
  }

  @Test
  void page_returnsWholeListWhenSizeExceedsData() {
    assertEquals(List.of("a", "b", "c"), Task29.page(List.of("a", "b", "c"), 0, 10));
  }

  @Test
  void page_doesNotModifyInput() {
    List<String> input = new ArrayList<>(List.of("a", "b", "c", "d"));
    List<String> snapshot = new ArrayList<>(input);
    Task29.page(input, 1, 2);
    assertEquals(snapshot, input);
  }
}
