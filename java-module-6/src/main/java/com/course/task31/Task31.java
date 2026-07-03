package com.course.task31;

import java.util.List;
import java.util.Map;

/**
 * Поиск ключей по заданному значению через for-each по entrySet.
 * Результат отсортирован через Collections.sort для детерминированного порядка.
 */
public class Task31 {

  public List<String> keysFor(Map<String, Integer> map, int value) {
    List<String> result = new java.util.ArrayList<>();

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() != null && entry.getValue() == value) {
        result.add(entry.getKey());
      }
    }

    java.util.Collections.sort(result);

    return result;
  }
}
