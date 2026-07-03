package com.course.task05;

/**
 * Задача со статусом выполнения.
 * Хранит заголовок и флаг done; по умолчанию done=false.
 */
public class Task {

  private String title;
  private boolean done;

  public Task(String title) {
    this.title = title;
    this.done = false;
  }

  public String getTitle() {
    return title;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Task task = (Task) o;
    if (done != task.done) return false;
    return title != null ? title.equals(task.title) : task.title == null;
  }

  @Override
  public int hashCode() {
    int result = title != null ? title.hashCode() : 0;
    result = 31 * result + (done ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Task{title='" + title + "', done=" + done + "}";
  }
}