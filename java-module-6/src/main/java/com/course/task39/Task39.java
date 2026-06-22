package com.course.task39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Простая система голосования.
 * Каждый пользователь может проголосовать только один раз; ведётся подсчёт голосов по кандидатам.
 */
public class Task39 {

    private Map<String, Integer> votes = new HashMap<>();
    private Set<String> votedUsers = new HashSet<>();

    public void vote(String userId, String candidate) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String winner() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public TreeMap<String, Integer> results() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
