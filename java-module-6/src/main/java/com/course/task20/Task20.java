package com.course.task20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task20 (WordFrequency): подсчёт частоты слов в списке.
 * Возвращает Map слово -> количество вхождений. Входной список не изменяет.
 */
public class Task20 {

  public Map<String, Integer> countWords(List<String> words) {
    Map<String, Integer> result = new HashMap<>();

    for (String word : words) {
      int currentCount = result.getOrDefault(word, 0);
      result.put(word, currentCount + 1);
    }
    return result;
  }
}
