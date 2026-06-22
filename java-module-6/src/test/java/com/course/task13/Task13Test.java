package com.course.task13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Task13Test {

  private final Task13 task = new Task13();

  @Test
  void intersectionReturnsCommonElements() {
    Set<Integer> a = Set.of(1, 2, 3, 4);
    Set<Integer> b = Set.of(3, 4, 5, 6);
    assertEquals(Set.of(3, 4), task.intersection(a, b));
  }

  @Test
  void intersectionOfDisjointSetsIsEmpty() {
    assertEquals(Set.of(), task.intersection(Set.of(1, 2), Set.of(3, 4)));
  }

  @Test
  void unionReturnsAllUniqueElements() {
    Set<Integer> a = Set.of(1, 2, 3);
    Set<Integer> b = Set.of(3, 4, 5);
    assertEquals(Set.of(1, 2, 3, 4, 5), task.union(a, b));
  }

  @Test
  void unionWithEmptyReturnsOther() {
    assertEquals(Set.of(1, 2), task.union(Set.of(1, 2), Set.of()));
  }

  @Test
  void differenceReturnsElementsInAButNotInB() {
    Set<Integer> a = Set.of(1, 2, 3, 4);
    Set<Integer> b = Set.of(3, 4, 5);
    assertEquals(Set.of(1, 2), task.difference(a, b));
  }

  @Test
  void differenceOfEqualSetsIsEmpty() {
    assertEquals(Set.of(), task.difference(Set.of(1, 2, 3), Set.of(1, 2, 3)));
  }

  @Test
  void intersectionDoesNotMutateInputs() {
    Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
    Set<Integer> b = new HashSet<>(Set.of(2, 3, 4));
    Set<Integer> snapshotA = new HashSet<>(a);
    Set<Integer> snapshotB = new HashSet<>(b);
    task.intersection(a, b);
    assertEquals(snapshotA, a);
    assertEquals(snapshotB, b);
  }

  @Test
  void unionDoesNotMutateInputs() {
    Set<Integer> a = new HashSet<>(Set.of(1, 2));
    Set<Integer> b = new HashSet<>(Set.of(3, 4));
    Set<Integer> snapshotA = new HashSet<>(a);
    Set<Integer> snapshotB = new HashSet<>(b);
    task.union(a, b);
    assertEquals(snapshotA, a);
    assertEquals(snapshotB, b);
  }
}
