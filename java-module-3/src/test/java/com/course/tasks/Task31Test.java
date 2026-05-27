package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

    @Test
    void constructorSetsStatus() {
        Task31 t = new Task31(Task31.Status.ACTIVE);
        assertEquals(Task31.Status.ACTIVE, t.getStatus());
    }

    @Test
    void getterReturnsStatus() {
        Task31 t = new Task31(Task31.Status.BANNED);
        assertEquals(Task31.Status.BANNED, t.getStatus());
    }

    @Test
    void setterChangesStatus() {
        Task31 t = new Task31(Task31.Status.INACTIVE);
        t.setStatus(Task31.Status.ACTIVE);
        assertEquals(Task31.Status.ACTIVE, t.getStatus());
    }

    @Test
    void canLoginTrueOnlyForActive() {
        assertTrue(new Task31(Task31.Status.ACTIVE).canLogin());
    }

    @Test
    void canLoginFalseForInactiveAndBanned() {
        assertFalse(new Task31(Task31.Status.INACTIVE).canLogin());
        assertFalse(new Task31(Task31.Status.BANNED).canLogin());
    }

    @Test
    void equalsAndNotEquals() {
        Task31 a = new Task31(Task31.Status.ACTIVE);
        Task31 b = new Task31(Task31.Status.ACTIVE);
        Task31 c = new Task31(Task31.Status.BANNED);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringContainsPrefixAndStatus() {
        String s = new Task31(Task31.Status.ACTIVE).toString();
        assertTrue(s.contains("Task31"));
        assertTrue(s.contains("ACTIVE"));
    }
}
