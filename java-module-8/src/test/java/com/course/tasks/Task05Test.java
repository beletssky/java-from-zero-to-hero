package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class Task05Test {

  @Test
  void convertsLowercaseToUppercase() {
    assertEquals("HELLO", Task05.toUpper().apply("hello"));
  }

  @Test
  void keepsAlreadyUppercase() {
    assertEquals("WORLD", Task05.toUpper().apply("WORLD"));
  }

  @Test
  void convertsMixedCase() {
    assertEquals("JAVA", Task05.toUpper().apply("JaVa"));
  }

  @Test
  void emptyStringStaysEmpty() {
    assertEquals("", Task05.toUpper().apply(""));
  }

  @Test
  void handlesNonLetterCharacters() {
    assertEquals("123-ABC!", Task05.toUpper().apply("123-abc!"));
  }

  @Test
  void factoryReturnsNonNullFunction() {
    assertNotNull(Task05.toUpper());
  }
}
