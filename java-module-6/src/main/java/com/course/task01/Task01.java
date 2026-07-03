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
    words.add(w);
  }

  public List<String> getAll() {
    return new ArrayList<>(words);
  }

  public int size() {
    return words.size();
  }

  public boolean contains(String w) {
    return words.contains(w);
  }

  public void remove(String w) {
    words.remove(w);
  }
}