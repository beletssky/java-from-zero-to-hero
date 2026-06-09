package com.course.task42;

/**
 * Задача с названием, приоритетом и признаком выполнения.
 * Метод isUrgent() сообщает о высокой срочности.
 */
public class Job {
    private String title;
    private Priority priority;
    private boolean done;

    public Job(String title, Priority priority) {
        // TODO: реализуй
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        // TODO: реализуй
        return title;
    }

    public Priority getPriority() {
        // TODO: реализуй
        return priority;
    }

    public boolean isDone() {
        // TODO: реализуй
        return done;
    }

    public void setDone(boolean done) {
        // TODO: реализуй
        this.done = done;
    }

    public boolean isUrgent() {
        // TODO: реализуй
        return priority.equals(Priority.HIGH) || priority.equals(Priority.CRITICAL);
    }
}
