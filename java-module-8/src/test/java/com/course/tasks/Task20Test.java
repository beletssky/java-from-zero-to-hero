package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task20Test {

  @Test
  void returnsValueWhenPresent() {
    assertEquals("ok", Task20.getOrThrow(Optional.of("ok")));
  }

  @Test
  void throwsNoSuchElementExceptionWhenEmpty() {
    assertThrows(NoSuchElementException.class,
        () -> Task20.getOrThrow(Optional.empty()));
  }

  @Test
  void exceptionMessageMatchesRussianText() {
    NoSuchElementException ex = assertThrows(NoSuchElementException.class,
        () -> Task20.getOrThrow(Optional.empty()));
    assertEquals("значение отсутствует", ex.getMessage());
  }

  @Test
  void returnsEmptyStringWhenPresentAsEmptyString() {
    assertEquals("", Task20.getOrThrow(Optional.of("")));
  }

  @Test
  void returnsLongStringWhenPresent() {
    String value = "the quick brown fox";
    assertEquals(value, Task20.getOrThrow(Optional.of(value)));
  }

  @Test
  void returnsExactStringInstanceWhenPresent() {
    String value = "kyiv";
    assertEquals(value, Task20.getOrThrow(Optional.of(value)));
  }
}
