package com.course.task22;

import java.util.HashMap;
import java.util.Map;

/**
 * Task22 (CharCounter): подсчёт количества символов в строке.
 * Пропускает пробелы. Бросает IllegalArgumentException при null.
 */
public class Task22 {

  public Map<Character, Integer> countChars(String s) {
    if (s == null) {
      throw new IllegalArgumentException("String must not be null");
    }

    Map<Character, Integer> result = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (c == ' ') {
        continue;
      }
      int currentCount =  result.getOrDefault(c, 0);
      result.put(c, currentCount + 1);
    }
    return result;
  }
}
