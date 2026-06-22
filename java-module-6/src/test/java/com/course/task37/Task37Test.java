package com.course.task37;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task37Test {

  @Test
  void compareTo_majorDominatesMinorAndPatch() {
    Version v1 = new Version(1, 99, 99);
    Version v2 = new Version(2, 0, 0);
    assertTrue(v1.compareTo(v2) < 0);
  }

  @Test
  void compareTo_minorBreaksMajorTie() {
    Version v1 = new Version(1, 2, 5);
    Version v2 = new Version(1, 3, 0);
    assertTrue(v1.compareTo(v2) < 0);
  }

  @Test
  void compareTo_patchBreaksMajorMinorTie() {
    Version v1 = new Version(1, 2, 3);
    Version v2 = new Version(1, 2, 4);
    assertTrue(v1.compareTo(v2) < 0);
  }

  @Test
  void compareTo_returnsZeroForEqualVersions() {
    Version v1 = new Version(1, 2, 3);
    Version v2 = new Version(1, 2, 3);
    assertEquals(0, v1.compareTo(v2));
  }

  @Test
  void sortNatural_sortsAscending() {
    List<Version> input = new ArrayList<>(Arrays.asList(
        new Version(2, 0, 0),
        new Version(1, 2, 3),
        new Version(1, 10, 0),
        new Version(1, 2, 4)));
    List<Version> sorted = new Task37().sortNatural(input);
    assertEquals(new Version(1, 2, 3), sorted.get(0));
    assertEquals(new Version(1, 2, 4), sorted.get(1));
    assertEquals(new Version(1, 10, 0), sorted.get(2));
    assertEquals(new Version(2, 0, 0), sorted.get(3));
  }

  @Test
  void sortDesc_sortsDescending() {
    List<Version> input = new ArrayList<>(Arrays.asList(
        new Version(1, 0, 0),
        new Version(2, 5, 1),
        new Version(2, 5, 0),
        new Version(3, 0, 0)));
    List<Version> sorted = new Task37().sortDesc(input);
    assertEquals(new Version(3, 0, 0), sorted.get(0));
    assertEquals(new Version(2, 5, 1), sorted.get(1));
    assertEquals(new Version(2, 5, 0), sorted.get(2));
    assertEquals(new Version(1, 0, 0), sorted.get(3));
  }

  @Test
  void sortNatural_doesNotMutateInput() {
    List<Version> input = new ArrayList<>(Arrays.asList(
        new Version(3, 0, 0),
        new Version(1, 0, 0)));
    List<Version> snapshot = new ArrayList<>(input);
    List<Version> sorted = new Task37().sortNatural(input);
    assertNotSame(input, sorted);
    assertEquals(snapshot.get(0).getMajor(), input.get(0).getMajor());
    assertEquals(snapshot.get(1).getMajor(), input.get(1).getMajor());
  }

  @Test
  void sortDesc_doesNotMutateInput() {
    List<Version> input = new ArrayList<>(Arrays.asList(
        new Version(1, 0, 0),
        new Version(3, 0, 0)));
    List<Version> snapshot = new ArrayList<>(input);
    new Task37().sortDesc(input);
    assertEquals(snapshot.get(0).getMajor(), input.get(0).getMajor());
    assertEquals(snapshot.get(1).getMajor(), input.get(1).getMajor());
  }
}
