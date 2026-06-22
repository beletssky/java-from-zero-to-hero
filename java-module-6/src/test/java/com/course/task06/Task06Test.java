package com.course.task06;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task06Test {

  @Test
  void reverse_returnsReversedList() {
    Task06 r = new Task06();
    assertEquals(List.of(3, 2, 1), r.reverse(List.of(1, 2, 3)));
  }

  @Test
  void reverse_doesNotModifyInput() {
    Task06 r = new Task06();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
    List<Integer> snapshot = new ArrayList<>(input);
    r.reverse(input);
    assertEquals(snapshot, input);
  }

  @Test
  void reverse_returnsEmpty_whenInputEmpty() {
    Task06 r = new Task06();
    assertEquals(List.of(), r.reverse(List.of()));
  }

  @Test
  void reverse_returnsSameSingleElement() {
    Task06 r = new Task06();
    assertEquals(List.of(42), r.reverse(List.of(42)));
  }

  @Test
  void reverseInPlace_mutatesInput() {
    Task06 r = new Task06();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4));
    r.reverseInPlace(input);
    assertEquals(List.of(4, 3, 2, 1), input);
  }

  @Test
  void reverseInPlace_emptyList_remainsEmpty() {
    Task06 r = new Task06();
    List<Integer> input = new ArrayList<>();
    r.reverseInPlace(input);
    assertEquals(List.of(), input);
  }
}
