package com.course.task42;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task42Test {

    @Test
    void constructorInitializesFieldsWithDoneFalse() {
        Job job = new Job("Write report", Priority.HIGH);
        assertEquals("Write report", job.getTitle());
        assertEquals(Priority.HIGH, job.getPriority());
        assertFalse(job.isDone());
    }

    @Test
    void gettersReturnConstructorValues() {
        Job job = new Job("Email", Priority.LOW);
        assertEquals("Email", job.getTitle());
        assertEquals(Priority.LOW, job.getPriority());
    }

    @Test
    void isUrgentReturnsFalseForLowAndMedium() {
        Job low = new Job("a", Priority.LOW);
        Job medium = new Job("b", Priority.MEDIUM);
        assertFalse(low.isUrgent());
        assertFalse(medium.isUrgent());
    }

    @Test
    void isUrgentReturnsTrueForHighAndCritical() {
        Job high = new Job("a", Priority.HIGH);
        Job critical = new Job("b", Priority.CRITICAL);
        assertTrue(high.isUrgent());
        assertTrue(critical.isUrgent());
    }

    @Test
    void setDoneUpdatesIsDone() {
        Job job = new Job("Task", Priority.MEDIUM);
        assertFalse(job.isDone());
        job.setDone(true);
        assertTrue(job.isDone());
        job.setDone(false);
        assertFalse(job.isDone());
    }
}
