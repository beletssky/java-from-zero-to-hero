package com.course.task22;

import java.util.HashMap;
import java.util.Map;

/**
 * Task22 (CharCounter): подсчёт количества символов в строке.
 * Пропускает пробелы. Бросает IllegalArgumentException при null.
 */
public class Task22 {

    public Map<Character, Integer> countChars(String s) {
        // TODO: реализуй
        if (s == null) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (c.equals(' ')) continue;
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
