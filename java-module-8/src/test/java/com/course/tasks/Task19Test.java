package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task19Test {

  @Test
  void invokesConsumerWhenValuePresent() {
    List<String> captured = new ArrayList<>();
    Task19.ifPresentPrint(Optional.of("hi"), captured::add);
    assertEquals(List.of("hi"), captured);
  }

  @Test
  void doesNotInvokeConsumerWhenEmpty() {
    List<String> captured = new ArrayList<>();
    Task19.ifPresentPrint(Optional.empty(), captured::add);
    assertTrue(captured.isEmpty());
  }

  @Test
  void passesExactValueToConsumer() {
    List<String> captured = new ArrayList<>();
    Task19.ifPresentPrint(Optional.of("Kyiv"), captured::add);
    assertEquals(1, captured.size());
    assertEquals("Kyiv", captured.get(0));
  }

  @Test
  void handlesEmptyStringValue() {
    List<String> captured = new ArrayList<>();
    Task19.ifPresentPrint(Optional.of(""), captured::add);
    assertEquals(List.of(""), captured);
  }

  @Test
  void appendsToStringBuilderWhenPresent() {
    StringBuilder sb = new StringBuilder();
    Task19.ifPresentPrint(Optional.of("abc"), sb::append);
    assertEquals("abc", sb.toString());
  }

  @Test
  void leavesStringBuilderUntouchedWhenEmpty() {
    StringBuilder sb = new StringBuilder();
    Task19.ifPresentPrint(Optional.empty(), sb::append);
    assertEquals("", sb.toString());
  }
}
