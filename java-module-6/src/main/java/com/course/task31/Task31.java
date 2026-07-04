package com.course.task31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Поиск ключей по заданному значению через for-each по entrySet.
 * Результат отсортирован через Collections.sort для детерминированного порядка.
 */
public class Task31 {

    public List<String> keysFor(Map<String, Integer> map, int value) {
        // TODO: реализуй
        List<String> result = new ArrayList<>();
        if (map == null || map.isEmpty()) {
            return result;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer currentValue = entry.getValue();
            if (currentValue != null && currentValue.equals(value)) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}
