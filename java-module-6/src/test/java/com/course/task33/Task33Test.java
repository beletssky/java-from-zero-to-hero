package com.course.task33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

  @Test
  void evenSplit() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
    List<List<Integer>> result = t.batches(input, 2);
    assertEquals(3, result.size());
    assertEquals(List.of(1, 2), result.get(0));
    assertEquals(List.of(3, 4), result.get(1));
    assertEquals(List.of(5, 6), result.get(2));
  }

  @Test
  void unevenSplitLastBatchSmaller() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
    List<List<Integer>> result = t.batches(input, 3);
    assertEquals(3, result.size());
    assertEquals(List.of(1, 2, 3), result.get(0));
    assertEquals(List.of(4, 5, 6), result.get(1));
    assertEquals(List.of(7), result.get(2));
  }

  @Test
  void emptyInputReturnsEmptyList() {
    Task33 t = new Task33();
    List<List<Integer>> result = t.batches(new ArrayList<>(), 3);
    assertTrue(result.isEmpty());
  }

  @Test
  void batchSizeLargerThanInputReturnsSingleBatch() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
    List<List<Integer>> result = t.batches(input, 10);
    assertEquals(1, result.size());
    assertEquals(List.of(1, 2, 3), result.get(0));
  }

  @Test
  void batchSizeZeroThrows() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
    assertThrows(IllegalArgumentException.class, () -> t.batches(input, 0));
  }

  @Test
  void batchSizeNegativeThrows() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
    assertThrows(IllegalArgumentException.class, () -> t.batches(input, -2));
  }

  @Test
  void inputListIsNotModified() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    List<Integer> snapshot = new ArrayList<>(input);
    t.batches(input, 2);
    assertEquals(snapshot, input);
  }

  @Test
  void batchSizeOneProducesSingletonBatches() {
    Task33 t = new Task33();
    List<Integer> input = new ArrayList<>(List.of(10, 20, 30));
    List<List<Integer>> result = t.batches(input, 1);
    assertEquals(3, result.size());
    assertEquals(List.of(10), result.get(0));
    assertEquals(List.of(20), result.get(1));
    assertEquals(List.of(30), result.get(2));
  }
}
