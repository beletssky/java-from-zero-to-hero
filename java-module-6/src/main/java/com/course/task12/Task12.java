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
    tags.add(tag);
  }

  public boolean has(String tag) {
    return tags.contains(tag);
  }

  public Set<String> all() {
    return new HashSet<>(tags);
  }

  public void remove(String tag) {
    tags.remove(tag);
  }

  public int size() {
    return tags.size();
  }
}
