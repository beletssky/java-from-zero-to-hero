package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task12Test {

  @Test
  void orDefault_returnsValueWhenNotNull() {
    assertEquals("x", Task12.orDefault("x", () -> "def"));
  }

  @Test
  void orDefault_returnsSupplierResultWhenValueIsNull() {
    assertEquals("def", Task12.orDefault(null, () -> "def"));
  }

  @Test
  void orDefault_treatsEmptyStringAsNonNull() {
    assertEquals("", Task12.orDefault("", () -> "def"));
  }

  @Test
  void orDefault_doesNotInvokeSupplierWhenValueIsPresent() {
    Task12.orDefault(
        "present",
        () -> {
          throw new AssertionError("supplier must not be called when value is not null");
        });
  }

  @Test
  void orDefault_invokesSupplierExactlyOnceForNullValue() {
    int[] calls = {0};
    String result =
        Task12.orDefault(
            null,
            () -> {
              calls[0]++;
              return "computed";
            });
    assertEquals("computed", result);
    assertEquals(1, calls[0]);
  }
}
