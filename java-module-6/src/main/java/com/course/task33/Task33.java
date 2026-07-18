package com.course.task33;

import java.util.ArrayList;
import java.util.List;

/**
 * Разбиение списка на батчи фиксированного размера (последний может быть меньше).
 * batchSize <= 0 → IllegalArgumentException. Входной список не модифицируется.
 */
public class Task33 {

    public List<List<Integer>> batches(List<Integer> input, int batchSize) {
        // TODO: реализуй
        if (batchSize <= 0) {
            throw new IllegalArgumentException();
        }
        List<List<Integer>> result = new ArrayList<>();

        if (input == null || input.isEmpty()) {
            return result;
        }

        for (int i = 0; i < input.size(); i += batchSize) {
            int endIndex = Math.min(i + batchSize, input.size());

            List<Integer> batch = new ArrayList<>(input.subList(i, endIndex));

            result.add(batch);
        }

        return result;
    }
}
