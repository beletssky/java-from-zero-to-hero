package com.course.task23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Task23Test {

  @Test
  void setAndGetReturnsStoredValue() {
    Task23 store = new Task23();
    store.set("theme", "dark");
    assertEquals("dark", store.get("theme"));
  }

  @Test
  void getReturnsNullForUnknownKey() {
    Task23 store = new Task23();
    assertNull(store.get("missing"));
  }

  @Test
  void getOrDefaultReturnsDefaultWhenAbsent() {
    Task23 store = new Task23();
    assertEquals("light", store.getOrDefault("theme", "light"));
  }

  @Test
  void getOrDefaultReturnsStoredValueWhenPresent() {
    Task23 store = new Task23();
    store.set("theme", "dark");
    assertEquals("dark", store.getOrDefault("theme", "light"));
  }

  @Test
  void removeDeletesEntry() {
    Task23 store = new Task23();
    store.set("theme", "dark");
    store.remove("theme");
    assertNull(store.get("theme"));
  }

  @Test
  void keysReturnsCopyOfKeySet() {
    Task23 store = new Task23();
    store.set("a", "1");
    store.set("b", "2");
    Set<String> keys = store.keys();
    assertEquals(Set.of("a", "b"), keys);

    Set<String> again = store.keys();
    assertNotSame(keys, again);
    assertTrue(keys.equals(again));
  }
}
