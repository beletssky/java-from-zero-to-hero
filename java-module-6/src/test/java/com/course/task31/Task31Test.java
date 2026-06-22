package com.course.task31;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

  @Test
  void returnsKeysWithMatchingValueSorted() {
    Task31 t = new Task31();
    Map<String, Integer> m = new HashMap<>();
    m.put("c", 1);
    m.put("a", 1);
    m.put("b", 2);
    m.put("d", 1);
    assertEquals(List.of("a", "c", "d"), t.keysFor(m, 1));
  }

  @Test
  void noMatchReturnsEmptyList() {
    Task31 t = new Task31();
    Map<String, Integer> m = new HashMap<>();
    m.put("a", 1);
    m.put("b", 2);
    assertTrue(t.keysFor(m, 99).isEmpty());
  }

  @Test
  void emptyMapReturnsEmptyList() {
    Task31 t = new Task31();
    assertTrue(t.keysFor(new HashMap<>(), 5).isEmpty());
  }

  @Test
  void singleMatch() {
    Task31 t = new Task31();
    Map<String, Integer> m = new HashMap<>();
    m.put("alpha", 7);
    m.put("beta", 8);
    assertEquals(List.of("alpha"), t.keysFor(m, 7));
  }

  @Test
  void allKeysMatchSameValue() {
    Task31 t = new Task31();
    Map<String, Integer> m = new HashMap<>();
    m.put("z", 5);
    m.put("a", 5);
    m.put("m", 5);
    assertEquals(List.of("a", "m", "z"), t.keysFor(m, 5));
  }

  @Test
  void handlesNegativeValueLookup() {
    Task31 t = new Task31();
    Map<String, Integer> m = new HashMap<>();
    m.put("a", -1);
    m.put("b", 0);
    m.put("c", -1);
    assertEquals(List.of("a", "c"), t.keysFor(m, -1));
  }
}
