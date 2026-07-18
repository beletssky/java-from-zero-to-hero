package com.course.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Список слов с базовыми операциями.
 * Хранит строки и поддерживает добавление, удаление и поиск.
 */
public class Task01 {

    private List<String> words = new ArrayList<>();

    public void add(String w) {
        // TODO: реализуй
        words.add(w);
    }

    public List<String> getAll() {
        // TODO: реализуй
        return new ArrayList<>(words);
    }

    public int size() {
        // TODO: реализуй
        return words.size();
    }

    public boolean contains(String w) {
        // TODO: реализуй
        return words.contains(w);
    }

    public void remove(String w) {
        // TODO: реализуй
        words.remove(w);
    }
}
