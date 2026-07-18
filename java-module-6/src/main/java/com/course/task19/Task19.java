package com.course.task19;

import java.util.HashMap;
import java.util.Map;

/**
 * Task19 (AgeRegistry): хранит соответствие имя -> возраст.
 * Предоставляет операции добавления, получения, проверки и удаления.
 */
public class Task19 {

  private Map<String, Integer> ages = new HashMap<>();

  public void set(String name, int age) {
    ages.put(name, age);
  }

  public Integer get(String name) {
    return ages.get(name);
  }

  public boolean has(String name) {
    return ages.containsKey(name);
  }

  public void remove(String name) {
    ages.remove(name);
  }

  public int size() {
    return ages.size();
  }
}
