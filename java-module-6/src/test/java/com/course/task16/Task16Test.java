package com.course.task16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Task16Test {

  private final Task16 task = new Task16();

  @Test
  void uniqueLettersHelloWorldExample() {
    assertEquals(Set.of('h', 'e', 'l', 'o', 'w', 'r', 'd'), task.uniqueLetters("Hello World"));
  }

  @Test
  void uniqueLettersIgnoresSpaces() {
    Set<Character> result = task.uniqueLetters("a b c");
    assertEquals(Set.of('a', 'b', 'c'), result);
  }

  @Test
  void uniqueLettersLowercasesEverything() {
    assertEquals(Set.of('a', 'b', 'c'), task.uniqueLetters("AaBbCc"));
  }

  @Test
  void uniqueLettersEmptyStringReturnsEmptySet() {
    assertEquals(Set.of(), task.uniqueLetters(""));
  }

  @Test
  void uniqueLettersOnlySpacesReturnsEmptySet() {
    assertEquals(Set.of(), task.uniqueLetters("     "));
  }

  @Test
  void uniqueLettersNullThrowsIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> task.uniqueLetters(null));
  }

  @Test
  void uniqueLettersAllSameLetterCollapsesToOne() {
    assertEquals(Set.of('z'), task.uniqueLetters("zzzz"));
  }
}
