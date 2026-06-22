package com.course.task30;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

  @Test
  void sumsAllValues() {
    Task30 t = new Task30();
    Map<String, Integer> m = new HashMap<>();
    m.put("a", 1);
    m.put("b", 2);
    m.put("c", 3);
    assertEquals(6, t.sumValues(m));
  }

  @Test
  void emptyMapReturnsZero() {
    Task30 t = new Task30();
    assertEquals(0, t.sumValues(new HashMap<>()));
  }

  @Test
  void singleEntry() {
    Task30 t = new Task30();
    Map<String, Integer> m = new HashMap<>();
    m.put("only", 42);
    assertEquals(42, t.sumValues(m));
  }

  @Test
  void handlesNegativeValues() {
    Task30 t = new Task30();
    Map<String, Integer> m = new HashMap<>();
    m.put("a", 10);
    m.put("b", -3);
    m.put("c", -7);
    assertEquals(0, t.sumValues(m));
  }

  @Test
  void handlesZeroValues() {
    Task30 t = new Task30();
    Map<String, Integer> m = new HashMap<>();
    m.put("a", 0);
    m.put("b", 0);
    m.put("c", 5);
    assertEquals(5, t.sumValues(m));
  }

  @Test
  void largeMapSum() {
    Task30 t = new Task30();
    Map<String, Integer> m = new HashMap<>();
    int expected = 0;
    for (int i = 1; i <= 100; i++) {
      m.put("k" + i, i);
      expected += i;
    }
    assertEquals(expected, t.sumValues(m));
  }
}
