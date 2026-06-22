package com.course.task25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class Task25Test {

  @Test
  void setAndGetReturnsStoredScore() {
    Task25 board = new Task25();
    board.set("Alice", 100);
    assertEquals(Integer.valueOf(100), board.get("Alice"));
  }

  @Test
  void getReturnsNullForUnknownName() {
    Task25 board = new Task25();
    assertNull(board.get("Ghost"));
  }

  @Test
  void firstNameReturnsAlphabeticallyFirstKey() {
    Task25 board = new Task25();
    board.set("Charlie", 1);
    board.set("Alice", 2);
    board.set("Bob", 3);
    assertEquals("Alice", board.firstName());
  }

  @Test
  void firstNameThrowsWhenEmpty() {
    Task25 board = new Task25();
    assertThrows(NoSuchElementException.class, board::firstName);
  }

  @Test
  void allNamesReturnsKeysInSortedOrder() {
    Task25 board = new Task25();
    board.set("Charlie", 1);
    board.set("Alice", 2);
    board.set("Bob", 3);
    assertEquals(List.of("Alice", "Bob", "Charlie"), board.allNames());
  }

  @Test
  void allNamesReturnsEmptyListWhenEmpty() {
    Task25 board = new Task25();
    assertEquals(List.of(), board.allNames());
  }

  @Test
  void setOverridesPreviousScore() {
    Task25 board = new Task25();
    board.set("Alice", 100);
    board.set("Alice", 200);
    assertEquals(Integer.valueOf(200), board.get("Alice"));
  }
}
