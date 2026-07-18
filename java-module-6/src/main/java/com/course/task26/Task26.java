package com.course.task26;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Task26 (AccessOrderedCache): кэш на базе LinkedHashMap.
 * Сохраняет порядок вставки ключей (insertion order).
 */
public class Task26 {

  private LinkedHashMap<String, String> cache = new LinkedHashMap<>();

  public void put(String key, String value) {
    cache.put(key, value);
  }

  public String get(String key) {
    return cache.get(key);
  }

  public List<String> keysInOrder() {
    return List.copyOf(cache.keySet());
  }
}
