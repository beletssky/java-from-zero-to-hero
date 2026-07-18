package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Task42Test {

  @Test
  void prettyList_multipleElementsAreCommaSeparated() {
    assertEquals("[a, b, c]", Task42.prettyList(List.of("a", "b", "c")));
  }

  @Test
  void prettyList_emptyListReturnsBrackets() {
    assertEquals("[]", Task42.prettyList(List.of()));
  }

  @Test
  void prettyList_singleElementHasNoSeparator() {
    assertEquals("[x]", Task42.prettyList(List.of("x")));
  }

  @Test
  void prettyList_twoElementsHaveOneSeparator() {
    assertEquals("[a, b]", Task42.prettyList(List.of("a", "b")));
  }

  @Test
  void prettyList_preservesEncounterOrder() {
    assertEquals("[c, b, a]", Task42.prettyList(List.of("c", "b", "a")));
  }

  @Test
  void prettyList_preservesDuplicates() {
    assertEquals("[a, a, b]", Task42.prettyList(List.of("a", "a", "b")));
  }
}
