package com.course.task15;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/**
 * Task15: SortedTags — теги хранятся в TreeSet, отсортированные по алфавиту.
 * first()/last() кидают NoSuchElementException на пустом наборе.
 */
public class Task15 {

    private TreeSet<String> tags = new TreeSet<>();

    public void add(String t) {
        // TODO: реализуй
        if (t != null) {
            tags.add(t);
        }
    }

    public List<String> all() {
        // TODO: реализуй
        return new ArrayList<>(tags);
    }

    public String first() {
        // TODO: реализуй
        if (tags.isEmpty()) {
            throw new NoSuchElementException();
        }
        return tags.first();
    }

    public String last() {
        // TODO: реализуй
        if (tags.isEmpty()) {
            throw new NoSuchElementException();
        }
        return tags.last();
    }
}
