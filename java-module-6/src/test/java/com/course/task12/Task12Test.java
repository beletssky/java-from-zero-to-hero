package com.course.task12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Task12Test {

  @Test
  void addAndHasReturnsTrueForAddedTag() {
    Task12 bag = new Task12();
    bag.add("java");
    assertTrue(bag.has("java"));
  }

  @Test
  void hasReturnsFalseForUnknownTag() {
    Task12 bag = new Task12();
    bag.add("java");
    assertFalse(bag.has("python"));
  }

  @Test
  void addingSameTagTwiceKeepsSizeOne() {
    Task12 bag = new Task12();
    bag.add("dup");
    bag.add("dup");
    assertEquals(1, bag.size());
  }

  @Test
  void removeDeletesExistingTag() {
    Task12 bag = new Task12();
    bag.add("java");
    bag.add("python");
    bag.remove("java");
    assertFalse(bag.has("java"));
    assertEquals(1, bag.size());
  }

  @Test
  void removeMissingTagDoesNothing() {
    Task12 bag = new Task12();
    bag.add("a");
    bag.remove("zzz");
    assertEquals(1, bag.size());
  }

  @Test
  void allReturnsCopyMutatingItDoesNotAffectInternal() {
    Task12 bag = new Task12();
    bag.add("a");
    bag.add("b");
    Set<String> snapshot = bag.all();
    snapshot.clear();
    assertEquals(2, bag.size());
    assertTrue(bag.has("a"));
    assertTrue(bag.has("b"));
  }

  @Test
  void allReturnsExpectedSetContents() {
    Task12 bag = new Task12();
    bag.add("a");
    bag.add("b");
    assertEquals(Set.of("a", "b"), bag.all());
  }

  @Test
  void sizeOfEmptyBagIsZero() {
    Task12 bag = new Task12();
    assertEquals(0, bag.size());
  }
}
