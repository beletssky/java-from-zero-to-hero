package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class Task09Test {

  @Test
  void measure_returnsFunctionResult() {
    assertEquals(5, Task09.measure("hello", String::length));
  }

  @Test
  void measure_returnsZeroForEmptyStringWithLength() {
    assertEquals(0, Task09.measure("", String::length));
  }

  @Test
  void measure_appliesDoubleLengthLambda() {
    Function<String, Integer> doubleLen = s -> s.length() * 2;
    assertEquals(10, Task09.measure("hello", doubleLen));
  }

  @Test
  void measure_worksWithConstantFunction() {
    assertEquals(42, Task09.measure("anything", s -> 42));
  }

  @Test
  void measure_supportsIntegerParseInt() {
    assertEquals(123, Task09.measure("123", Integer::parseInt));
  }
}
