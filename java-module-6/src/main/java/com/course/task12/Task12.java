package com.course.task12;

import java.util.HashSet;
import java.util.Set;

/**
 * Task12: TagBag — мешок тегов на основе HashSet.
 * Метод all() возвращает копию, чтобы внешние мутации не влияли на внутреннее состояние.
 */
public class Task12 {

    private Set<String> tags = new HashSet<>();

    public void add(String tag) {
        // TODO: реализуй
        tags.add(tag);
    }

    public boolean has(String tag) {
        // TODO: реализуй
        return tags.contains(tag);
    }

    public Set<String> all() {
        // TODO: реализуй
        return new HashSet<>(tags);
    }

    public void remove(String tag) {
        // TODO: реализуй
        tags.remove(tag);
    }

    public int size() {
        // TODO: реализуй
        return tags.size();
    }
}
