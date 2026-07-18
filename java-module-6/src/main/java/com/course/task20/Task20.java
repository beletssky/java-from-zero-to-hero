package com.course.task20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task20 (WordFrequency): подсчёт частоты слов в списке.
 * Возвращает Map слово -> количество вхождений. Входной список не изменяет.
 */
public class Task20 {

    public Map<String, Integer> countWords(List<String> words) {
        // TODO: реализуй
        if (words == null || words.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (word == null) {
                continue;
            }
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}