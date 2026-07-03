package com.course.task25;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Task25 (SortedScoreBoard): хранит результаты участников, отсортированные по имени.
 * Использует TreeMap, что обеспечивает алфавитный порядок ключей.
 */
public class Task25 {

  private TreeMap<String, Integer> scores = new TreeMap<>();

  public void set(String name, int score) {
    scores.put(name, score);
  }

  public Integer get(String name) {
    return scores.get(name);
  }

  public String firstName() {
    return scores.firstKey();
  }

  public List<String> allNames() {
    return new ArrayList<>(scores.keySet());
  }
}
