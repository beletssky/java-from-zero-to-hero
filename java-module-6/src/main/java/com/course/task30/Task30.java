package com.course.task30;

import java.util.Map;

/**
 * Суммирование значений Map через for-each по entrySet.
 * Возвращает сумму всех Integer-значений; для пустой Map — 0.
 */
public class Task30 {

    public int sumValues(Map<String, Integer> map) {
        // TODO: реализуй
        if (map == null || map.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();

            if (value != null) {
                sum += value;
            }
        }

        return sum;
    }
}
