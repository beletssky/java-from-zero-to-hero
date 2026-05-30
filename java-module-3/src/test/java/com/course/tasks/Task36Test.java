package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @Test
    void constructorSetsFields() {
        Task36 s = new Task36("Anna", 80);
        assertEquals("Anna", s.getName());
        assertEquals(80, s.getScore());
    }

    @Test
    void constructorInvalidScoreThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task36("Bob", -1));
        assertThrows(IllegalArgumentException.class, () -> new Task36("Bob", 101));
    }

    @Test
    void setScoreValidAndInvalid() {
        Task36 s = new Task36("Anna", 50);
        s.setScore(95);
        assertEquals(95, s.getScore());
        assertThrows(IllegalArgumentException.class, () -> s.setScore(200));
    }

    @Test
    void gradeBoundariesUpper() {
        assertEquals(Task36.Grade.A, new Task36("x", 90).getGrade());
        assertEquals(Task36.Grade.B, new Task36("x", 89).getGrade());
        assertEquals(Task36.Grade.B, new Task36("x", 75).getGrade());
    }

    @Test
    void gradeBoundariesLower() {
        assertEquals(Task36.Grade.C, new Task36("x", 65).getGrade());
        assertEquals(Task36.Grade.D, new Task36("x", 50).getGrade());
        assertEquals(Task36.Grade.F, new Task36("x", 49).getGrade());
        assertEquals(Task36.Grade.F, new Task36("x", 0).getGrade());
    }

    @Test
    void equalsAndNotEquals() {
        Task36 a = new Task36("Anna", 80);
        Task36 b = new Task36("Anna", 80);
        Task36 c = new Task36("Anna", 81);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringContainsPrefixNameAndScore() {
        String s = new Task36("Anna", 80).toString();
        assertTrue(s.contains("Student"));
        assertTrue(s.contains("Anna"));
        assertTrue(s.contains("80"));
    }
}
