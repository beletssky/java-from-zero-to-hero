package com.course.task23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Task23 (SettingsStore): простое хранилище настроек ключ -> значение.
 * Возвращает копию набора ключей, исходное хранилище не открывает наружу.
 */
public class Task23 {

    private Map<String, String> settings = new HashMap<>();

    public void set(String key, String value) {
        // TODO: реализуй
        settings.put(key, value);
    }

    public String get(String key) {
        // TODO: реализуй
        return settings.get(key);
    }

    public String getOrDefault(String key, String def) {
        // TODO: реализуй
        return settings.getOrDefault(key, def);
    }

    public void remove(String key) {
        // TODO: реализуй
        settings.remove(key);
    }

    public Set<String> keys() {
        // TODO: реализуй
        return new HashSet<>(settings.keySet());
    }
}
