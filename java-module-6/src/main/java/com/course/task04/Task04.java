package com.course.task04;

import java.util.List;

/**
 * Фильтрация строк по минимальной длине.
 * Возвращает новый список, входной список не изменяется.
 */
public class Task04 {

  public List<String> filterByLength(List<String> input, int minLen) {
    List<String> result = new java.util.ArrayList<>();
    for (String s : input) {
      if (s.length() >= minLen) {
        result.add(s);
      }
    }
    return result;
  }
}