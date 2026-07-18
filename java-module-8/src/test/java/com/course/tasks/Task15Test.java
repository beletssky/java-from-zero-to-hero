package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task15Test {

  @Test
  void wrapsNullIntoEmptyOptional() {
    Optional<String> result = Task15.wrap(null);
    assertTrue(result.isEmpty());
  }

  @Test
  void wrapsNonNullStringIntoPresentOptional() {
    Optional<String> result = Task15.wrap("hi");
    assertTrue(result.isPresent());
    assertEquals("hi", result.get());
  }

  @Test
  void wrapsEmptyStringIntoPresentOptional() {
    Optional<String> result = Task15.wrap("");
    assertTrue(result.isPresent());
    assertEquals("", result.get());
  }

  @Test
  void wrapsWhitespaceStringIntoPresentOptional() {
    Optional<String> result = Task15.wrap("   ");
    assertTrue(result.isPresent());
    assertEquals("   ", result.get());
  }

  @Test
  void wrapsLongStringIntoPresentOptional() {
    String value = "the quick brown fox jumps over the lazy dog";
    Optional<String> result = Task15.wrap(value);
    assertTrue(result.isPresent());
    assertEquals(value, result.get());
  }

  @Test
  void wrappedNullIsNotPresent() {
    assertFalse(Task15.wrap(null).isPresent());
  }
}
