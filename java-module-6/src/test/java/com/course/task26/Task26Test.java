package com.course.task26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class Task26Test {

  @Test
  void putAndGetReturnsStoredValue() {
    Task26 cache = new Task26();
    cache.put("a", "1");
    assertEquals("1", cache.get("a"));
  }

  @Test
  void getReturnsNullForUnknownKey() {
    Task26 cache = new Task26();
    assertNull(cache.get("missing"));
  }

  @Test
  void keysInOrderPreservesInsertionOrder() {
    Task26 cache = new Task26();
    cache.put("c", "3");
    cache.put("a", "1");
    cache.put("b", "2");
    assertEquals(List.of("c", "a", "b"), cache.keysInOrder());
  }

  @Test
  void keysInOrderReturnsEmptyListWhenEmpty() {
    Task26 cache = new Task26();
    assertEquals(List.of(), cache.keysInOrder());
  }

  @Test
  void putOverridesExistingValueWithoutReorderingKey() {
    Task26 cache = new Task26();
    cache.put("a", "1");
    cache.put("b", "2");
    cache.put("a", "11");
    assertEquals("11", cache.get("a"));
    assertEquals(List.of("a", "b"), cache.keysInOrder());
  }

  @Test
  void putAcceptsMultipleEntries() {
    Task26 cache = new Task26();
    cache.put("k1", "v1");
    cache.put("k2", "v2");
    assertEquals("v1", cache.get("k1"));
    assertEquals("v2", cache.get("k2"));
  }
}
