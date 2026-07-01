package com.course.task38;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Простой обратный индекс: слово → множество ID документов.
 * Используется для поиска документов по словам.
 */
public class Task38 {

    private Map<String, Set<Integer>> index = new HashMap<>();

    public void addDocument(int id, String text) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public Set<Integer> find(String word) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
