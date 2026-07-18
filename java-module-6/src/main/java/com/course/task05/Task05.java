package com.course.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Список задач (TodoList).
 * Поддерживает добавление, отметку выполненной, выборку и очистку выполненных.
 */
public class Task05 {

  private List<Task> tasks = new ArrayList<>();

  public void add(String title) {
    tasks.add(new Task(title));
  }

  public void markDone(int index) {
    tasks.get(index).setDone(true);
  }

  public List<Task> getDone() {
    List<Task> result = new ArrayList<>();
    for (Task t : tasks) {
      if (t.isDone()) {
        result.add(t);
      }
    }
    return result;
  }

  public List<Task> getPending() {
    List<Task> result = new ArrayList<>();
    for (Task t : tasks) {
      if (!t.isDone()) {
        result.add(t);
      }
    }
    return result;
  }

  public void clearDone() {
    for (int i = tasks.size() - 1; i >= 0; i--) {
      if (tasks.get(i).isDone()) {
        tasks.remove(i);
      }
    }
  }
}