package com.course.task04;

import java.util.ArrayList;
import java.util.List;

/**
 * Фильтрация строк по минимальной длине.
 * Возвращает новый список, входной список не изменяется.
 */
public class Task04 {

    public List<String> filterByLength(List<String> input, int minLen) {
        // TODO: реализуй
        if (input == null) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();

        for (String s : input) {
            if (s != null && s.length() >= minLen) {
                result.add(s);
            }
        }

        return result;

    }
}
