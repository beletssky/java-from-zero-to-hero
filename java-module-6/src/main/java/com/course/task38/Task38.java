package com.course.task38;

import java.util.*;

/**
 * Простой обратный индекс: слово → множество ID документов.
 * Используется для поиска документов по словам.
 */
public class Task38 {

    private Map<String, Set<Integer>> index = new HashMap<>();

    public void addDocument(int id, String text) {
        // TODO: реализуй
        if (text == null || text.isBlank()) {
            return;
        }
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            String cleanWord = word.toLowerCase();
            index.computeIfAbsent(cleanWord, k -> new HashSet<>()).add(id);
        }
    }

    public Set<Integer> find(String word) {
        // TODO: реализуй
        if (word == null || word.isBlank()) {
            return Collections.emptySet();
        }

        String cleanWord = word.toLowerCase();
        return index.getOrDefault(cleanWord, Collections.emptySet());
    }
}
