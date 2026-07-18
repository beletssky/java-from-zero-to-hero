package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task06Test {

  @Test
  void returnsAnArrayListInstance() {
    List<String> created = Task06.listFactory().get();
    assertInstanceOf(ArrayList.class, created);
  }

  @Test
  void returnsEmptyList() {
    List<String> created = Task06.listFactory().get();
    assertTrue(created.isEmpty());
  }

  @Test
  void hasSizeZero() {
    List<String> created = Task06.listFactory().get();
    assertEquals(0, created.size());
  }

  @Test
  void eachCallReturnsNewInstance() {
    List<String> first = Task06.listFactory().get();
    List<String> second = Task06.listFactory().get();
    assertNotSame(first, second);
  }

  @Test
  void resultIsMutable() {
    List<String> created = Task06.listFactory().get();
    created.add("x");
    assertEquals(List.of("x"), created);
  }

  @Test
  void factoryItselfIsNotNull() {
    assertNotNull(Task06.listFactory());
  }
}
