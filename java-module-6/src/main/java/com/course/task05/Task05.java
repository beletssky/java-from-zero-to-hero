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
        // TODO: реализуй
        tasks.add(new Task(title));
    }

    public void markDone(int index) {
        // TODO: реализуй
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDone(true);
        }
    }

    public List<Task> getDone() {
        // TODO: реализуй
        List<Task> doneTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isDone()) {
                doneTasks.add(task);
            }
        }
        return doneTasks;
    }

    public List<Task> getPending() {
        // TODO: реализуй
        List<Task> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isDone()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public void clearDone() {
        // TODO: реализуй
        tasks.removeIf(Task::isDone);
    }
}
