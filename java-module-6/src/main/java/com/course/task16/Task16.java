package com.course.task16;

import java.util.HashSet;
import java.util.Set;

/**
 * Task16: LetterCounter — множество уникальных букв строки в нижнем регистре.
 * Пробелы пропускаются, null приводит к IllegalArgumentException.
 */
public class Task16 {

  public Set<Character> uniqueLetters(String s) {
    if (s == null) {
      throw new IllegalArgumentException("String must not be null");
    }

    Set<Character> result = new HashSet<>();

    for (char c : s.toCharArray()) {
      if (c == ' ') {
        continue;
      }
      result.add(Character.toLowerCase(c));
    }
    return result;
  }
}
