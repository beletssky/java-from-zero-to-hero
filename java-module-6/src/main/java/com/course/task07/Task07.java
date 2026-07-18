package com.course.task07;

import java.util.List;

/**
 * Удаление дубликатов из списка строк.
 * Возвращает новый список, сохраняет порядок первого вхождения.
 */
public class Task07 {

    public List<String> removeDuplicates(List<String> input) {
        List<String> result = new java.util.ArrayList<>();
        for (String item : input) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}