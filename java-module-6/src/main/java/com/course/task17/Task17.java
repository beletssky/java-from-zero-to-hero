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
    blocked.add(email);
  }

  public boolean isBlocked(String email) {
    return blocked.contains(email);
  }

  public void unblock(String email) {
    blocked.remove(email);
  }

  public Set<String> allBlocked() {
    return new HashSet<>(blocked);
  }
}
