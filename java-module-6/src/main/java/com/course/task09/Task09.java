package com.course.task09;

import java.util.List;

/**
 * Топ-N наибольших чисел из списка.
 * Возвращает новый список в убывающем порядке, входной не изменяется.
 */
public class Task09 {

  public List<Integer> topN(List<Integer> input, int n) {
    List<Integer> sorted = new java.util.ArrayList<>(input);
    java.util.Collections.sort(sorted, java.util.Collections.reverseOrder());
    int limit = Math.min(n, sorted.size());
    return new java.util.ArrayList<>(sorted.subList(0, limit));
  }
}
