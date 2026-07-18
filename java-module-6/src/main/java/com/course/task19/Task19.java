package com.course.task19;

import java.util.HashMap;
import java.util.Map;

/**
 * Task19 (AgeRegistry): хранит соответствие имя -> возраст.
 * Предоставляет операции добавления, получения, проверки и удаления.
 */
public class Task19 {

    private Map<String, Integer> ages = new HashMap<>();

    public void set(String name, int age) {
        // TODO: реализуй
        ages.put(name, age);
    }

    public Integer get(String name) {
        // TODO: реализуй
        return ages.get(name);
    }

    public boolean has(String name) {
        // TODO: реализуй
        return ages.containsKey(name);
    }

    public void remove(String name) {
        // TODO: реализуй
        ages.remove(name);
    }

    public int size() {
        // TODO: реализуй
        return ages.size();
    }
}
