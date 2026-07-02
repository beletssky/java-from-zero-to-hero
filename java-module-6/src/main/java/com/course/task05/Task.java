package com.course.task05;

import java.util.Objects;

/**
 * Задача со статусом выполнения.
 * Хранит заголовок и флаг done; по умолчанию done=false.
 */
public class Task {

    private String title;
    private boolean done;

    public Task(String title) {
        // TODO: реализуй
        this.title = title;
        done = false;
    }

    public String getTitle() {
        // TODO: реализуй
        return title;
    }

    public boolean isDone() {
        // TODO: реализуй
        return done;
    }

    public void setDone(boolean done) {
        // TODO: реализуй
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return this.title.equals(task.title);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Task{title='" + title + "', done=" + done + "}";
    }
}
