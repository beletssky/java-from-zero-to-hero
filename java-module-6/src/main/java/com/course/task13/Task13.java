package com.course.task13;

import java.util.HashSet;
import java.util.Set;

/**
 * Task13: операции над множествами — пересечение, объединение, разность.
 * Возвращает новые Set, входные множества не модифицируются.
 */
public class Task13 {

    public Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
        // TODO: реализуй
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        // TODO: реализуй
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
        // TODO: реализуй
        Set<Integer> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
