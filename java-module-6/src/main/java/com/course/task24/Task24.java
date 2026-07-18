package com.course.task24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task24 (GroupBySize): группирует строки по их длине.
 * Возвращает Map длина -> список строк; порядок внутри группы сохраняется из входа.
 */
public class Task24 {

    public Map<Integer, List<String>> groupByLength(List<String> input) {
        // TODO: реализуй
        Map<Integer, List<String>> result = new HashMap<>();
        for (String element : input) {
            int length = element.length();
            result.computeIfAbsent(length, k -> new ArrayList<>()).add(element);
        }
        return result;
    }
}
