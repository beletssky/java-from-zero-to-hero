package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task18Test {

  @Test
  void keepsAgeWhenAbove18() {
    assertEquals(Optional.of(20), Task18.onlyAdult(Optional.of(20)));
  }

  @Test
  void keepsAgeWhenExactly18() {
    assertEquals(Optional.of(18), Task18.onlyAdult(Optional.of(18)));
  }

  @Test
  void dropsAgeWhenBelow18() {
    assertTrue(Task18.onlyAdult(Optional.of(17)).isEmpty());
  }

  @Test
  void dropsAgeWhenZero() {
    assertTrue(Task18.onlyAdult(Optional.of(0)).isEmpty());
  }

  @Test
  void returnsEmptyWhenInputIsEmpty() {
    assertTrue(Task18.onlyAdult(Optional.empty()).isEmpty());
  }

  @Test
  void keepsAgeForVeryLargeValue() {
    assertEquals(Optional.of(120), Task18.onlyAdult(Optional.of(120)));
  }
}
