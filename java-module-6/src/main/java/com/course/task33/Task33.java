package com.course.task33;

import java.util.List;

/**
 * Разбиение списка на батчи фиксированного размера (последний может быть меньше).
 * batchSize <= 0 → IllegalArgumentException. Входной список не модифицируется.
 */
public class Task33 {

  public List<List<Integer>> batches(List<Integer> input, int batchSize) {
    if (batchSize <= 0) {
      throw new IllegalArgumentException("Размер батча должен быть больше нуля");
    }

    List<List<Integer>> result = new java.util.ArrayList<>();

    for (int i = 0; i < input.size(); i += batchSize) {
      int end = i + batchSize;

      if (end > input.size()) {
        end = input.size();
      }

      List<Integer> batch = new java.util.ArrayList<>(input.subList(i, end));

      result.add(batch);
    }
    return result;
  }
}
