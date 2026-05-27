package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void constructor_setsAllFields() {
        Task20 s = new Task20(7, 10);
        assertEquals(7, s.getCorrect());
        assertEquals(10, s.getTotal());
    }

    @Test
    void getPercentage_computesValue() {
        Task20 s = new Task20(7, 10);
        assertEquals(70.0, s.getPercentage(), 1e-9);
    }

    @Test
    void getPercentage_returnsZeroForZeroTotal() {
        Task20 s = new Task20(0, 0);
        assertEquals(0.0, s.getPercentage(), 1e-9);
    }

    @Test
    void addCorrect_incrementsBoth() {
        Task20 s = new Task20(7, 10);
        s.addCorrect();
        assertEquals(8, s.getCorrect());
        assertEquals(11, s.getTotal());
    }

    @Test
    void addWrong_increasesTotalOnly() {
        Task20 s = new Task20(7, 10);
        s.addWrong(3);
        assertEquals(7, s.getCorrect());
        assertEquals(13, s.getTotal());
    }

    @Test
    void addWrong_throwsForNegative() {
        Task20 s = new Task20(7, 10);
        assertThrows(IllegalArgumentException.class, () -> s.addWrong(-1));
    }

    @Test
    void constructor_throwsWhenCorrectExceedsTotal() {
        assertThrows(IllegalArgumentException.class, () -> new Task20(11, 10));
    }

    @Test
    void constructor_throwsForNegativeCorrect() {
        assertThrows(IllegalArgumentException.class, () -> new Task20(-1, 10));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task20 a = new Task20(7, 10);
        Task20 b = new Task20(7, 10);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task20 a = new Task20(7, 10);
        Task20 b = new Task20(8, 10);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task20 s = new Task20(7, 10);
        String str = s.toString();
        assertTrue(str.contains("Score"));
        assertTrue(str.contains("7"));
        assertTrue(str.contains("10"));
    }
}
