package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task16Test {

  @Test
  void returnsValueWhenPresent() {
    assertEquals("Kyiv", Task16.orUnknown(Optional.of("Kyiv")));
  }

  @Test
  void returnsUnknownWhenEmpty() {
    assertEquals("unknown", Task16.orUnknown(Optional.empty()));
  }

  @Test
  void returnsEmptyStringWhenPresentAsEmptyString() {
    assertEquals("", Task16.orUnknown(Optional.of("")));
  }

  @Test
  void returnsExactStringValueWhenPresent() {
    assertEquals("hello world", Task16.orUnknown(Optional.of("hello world")));
  }

  @Test
  void doesNotAlterUnknownFallback() {
    String result = Task16.orUnknown(Optional.empty());
    assertEquals("unknown", result);
    assertEquals(7, result.length());
  }
}
