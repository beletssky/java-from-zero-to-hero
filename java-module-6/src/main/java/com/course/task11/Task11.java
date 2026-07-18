package com.course.task11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Task11: возвращает множество уникальных строк из входного списка.
 * Не модифицирует входной список.
 */
public class Task11 {

    public Set<String> unique(List<String> input) {
        // TODO: реализуй
        if (input == null) {
            return new HashSet<>();
        }
        return new HashSet<>(input);
    }
}
