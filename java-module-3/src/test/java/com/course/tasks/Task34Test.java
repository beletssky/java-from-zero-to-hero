package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task34Test {

    @Test
    void constructorSetsFields() {
        Task34 t = new Task34("Write report", Task34.Priority.HIGH);
        assertEquals("Write report", t.getTitle());
        assertEquals(Task34.Priority.HIGH, t.getPriority());
    }

    @Test
    void newTaskIsNotDone() {
        Task34 t = new Task34("Write report", Task34.Priority.LOW);
        assertFalse(t.isDone());
    }

    @Test
    void setPriorityChangesPriority() {
        Task34 t = new Task34("Write report", Task34.Priority.LOW);
        t.setPriority(Task34.Priority.CRITICAL);
        assertEquals(Task34.Priority.CRITICAL, t.getPriority());
    }

    @Test
    void completeSetsDoneTrue() {
        Task34 t = new Task34("Write report", Task34.Priority.MEDIUM);
        t.complete();
        assertTrue(t.isDone());
    }

    @Test
    void equalsAndNotEquals() {
        Task34 a = new Task34("A", Task34.Priority.LOW);
        Task34 b = new Task34("A", Task34.Priority.LOW);
        Task34 c = new Task34("B", Task34.Priority.LOW);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringContainsPrefixTitleAndPriority() {
        String s = new Task34("Deploy", Task34.Priority.CRITICAL).toString();
        assertTrue(s.contains("Task34"));
        assertTrue(s.contains("Deploy"));
        assertTrue(s.contains("CRITICAL"));
    }
}
