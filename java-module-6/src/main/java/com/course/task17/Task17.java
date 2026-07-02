package com.course.task17;

import java.util.HashSet;
import java.util.Set;

/**
 * Task17: BlackList — чёрный список email-ов на HashSet.
 * allBlocked() возвращает копию, чтобы внешние мутации не влияли на состояние.
 */
public class Task17 {

    private Set<String> blocked = new HashSet<>();

    public void block(String email) {
        // TODO: реализуй
        if (email != null) {
            blocked.add(email);
        }
    }

    public boolean isBlocked(String email) {
        // TODO: реализуй
        return blocked.contains(email);
    }

    public void unblock(String email) {
        // TODO: реализуй
        if (email != null) {
            blocked.remove(email);
        }
    }

    public Set<String> allBlocked() {
        // TODO: реализуй
        return new HashSet<>(blocked);
    }
}
