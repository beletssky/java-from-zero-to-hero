package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task25Test {

  @Test
  void longNamesUpper_filtersAndUppercasesNamesLongerThanThree() {
    assertEquals(
        List.of("CAROL", "DAVE"),
        Task25.longNamesUpper(List.of("Al", "Bob", "Carol", "Dave")));
  }

  @Test
  void longNamesUpper_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task25.longNamesUpper(List.of()));
  }

  @Test
  void longNamesUpper_returnsSingleUppercaseWhenSingleLongName() {
    assertEquals(List.of("ALICE"), Task25.longNamesUpper(List.of("Alice")));
  }

  @Test
  void longNamesUpper_returnsEmptyWhenAllNamesTooShort() {
    assertEquals(List.of(), Task25.longNamesUpper(List.of("Al", "Bo", "Cy", "abc")));
  }

  @Test
  void longNamesUpper_excludesNamesOfExactlyThreeChars() {
    assertEquals(List.of(), Task25.longNamesUpper(List.of("Bob", "Sam", "Kim")));
  }

  @Test
  void longNamesUpper_preservesOriginalOrder() {
    assertEquals(
        List.of("ZEBRA", "APPLE", "MANGO"),
        Task25.longNamesUpper(List.of("Zebra", "Apple", "Mango")));
  }

  @Test
  void longNamesUpper_doesNotModifyInput() {
    List<String> input = new ArrayList<>(List.of("Al", "Bob", "Carol"));
    List<String> snapshot = new ArrayList<>(input);
    Task25.longNamesUpper(input);
    assertEquals(snapshot, input);
  }
}
