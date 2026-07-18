package com.course.task26;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Task26 (AccessOrderedCache): кэш на базе LinkedHashMap.
 * Сохраняет порядок вставки ключей (insertion order).
 */
public class Task26 {

    private LinkedHashMap<String, String> cache = new LinkedHashMap<>();

    public void put(String key, String value) {
        // TODO: реализуй
        cache.put(key, value);
    }

    public String get(String key) {
        // TODO: реализуй
        return cache.get(key);
    }

    public List<String> keysInOrder() {
        // TODO: реализуй
        return new ArrayList<>(cache.keySet());
    }
}
