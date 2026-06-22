package com.course.task07;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task07Test {

  @Test
  void removeDuplicates_keepsFirstOccurrenceOrder() {
    Task07 dedup = new Task07();
    assertEquals(List.of("a", "b", "c"),
        dedup.removeDuplicates(List.of("a", "b", "a", "c", "b")));
  }

  @Test
  void removeDuplicates_returnsSameList_whenNoDuplicates() {
    Task07 dedup = new Task07();
    assertEquals(List.of("a", "b", "c"),
        dedup.removeDuplicates(List.of("a", "b", "c")));
  }

  @Test
  void removeDuplicates_returnsEmpty_whenInputEmpty() {
    Task07 dedup = new Task07();
    assertEquals(List.of(), dedup.removeDuplicates(List.of()));
  }

  @Test
  void removeDuplicates_collapsesAllSame() {
    Task07 dedup = new Task07();
    assertEquals(List.of("x"),
        dedup.removeDuplicates(List.of("x", "x", "x", "x")));
  }

  @Test
  void removeDuplicates_doesNotModifyInput() {
    Task07 dedup = new Task07();
    List<String> input = new ArrayList<>(List.of("a", "b", "a"));
    List<String> snapshot = new ArrayList<>(input);
    dedup.removeDuplicates(input);
    assertEquals(snapshot, input);
  }

  @Test
  void removeDuplicates_singleElement_returnsSame() {
    Task07 dedup = new Task07();
    assertEquals(List.of("only"), dedup.removeDuplicates(List.of("only")));
  }
}
