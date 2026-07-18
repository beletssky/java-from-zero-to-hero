package com.course.task07;

import java.util.ArrayList;
import java.util.List;

/**
 * Удаление дубликатов из списка строк.
 * Возвращает новый список, сохраняет порядок первого вхождения.
 */
public class Task07 {

    public List<String> removeDuplicates(List<String> input) {
        // TODO: реализуй
        if (input == null) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        for (String item : input) {
            if (result.contains(item)) continue;
            result.add(item);
        }

        return result;
    }
}
