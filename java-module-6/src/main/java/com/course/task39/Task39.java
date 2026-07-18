package com.course.task39;

import java.util.*;

/**
 * Простая система голосования.
 * Каждый пользователь может проголосовать только один раз; ведётся подсчёт голосов по кандидатам.
 */
public class Task39 {

    private Map<String, Integer> votes = new HashMap<>();
    private Set<String> votedUsers = new HashSet<>();

    public void vote(String userId, String candidate) {
        // TODO: реализуй
        if (userId == null || userId.isBlank() || candidate == null || candidate.isBlank()) {
            return;
        }

        if (!votedUsers.contains(userId)) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
            votedUsers.add(userId);
        } else throw new IllegalStateException();
    }

    public String winner() {
        // TODO: реализуй
        if (votes.isEmpty()) {
            return null;
        }

        String topCandidate = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                topCandidate = entry.getKey();
            }
        }

        return topCandidate;
    }

    public TreeMap<String, Integer> results() {
        // TODO: реализуй
        return new TreeMap<>(votes);
    }
}
