package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task43Test {

    @Test
    void rowsAndCols() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        assertEquals(2, m.getRows());
        assertEquals(3, m.getCols());
    }

    @Test
    void getElement() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        assertEquals(1, m.get(0, 0));
        assertEquals(6, m.get(1, 2));
        assertEquals(2, m.get(0, 1));
    }

    @Test
    void getInvalidRowThrows() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        assertThrows(IllegalArgumentException.class, () -> m.get(5, 0));
    }

    @Test
    void getInvalidColThrows() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        assertThrows(IllegalArgumentException.class, () -> m.get(0, 5));
    }

    @Test
    void getNegativeIndexThrows() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        assertThrows(IllegalArgumentException.class, () -> m.get(-1, 0));
    }

    @Test
    void transpose2x3Gives3x2() {
        Task43 m = new Task43(new int[][]{{1, 2, 3}, {4, 5, 6}});
        Task43 t = m.transpose();
        assertEquals(3, t.getRows());
        assertEquals(2, t.getCols());
        assertEquals(1, t.get(0, 0));
        assertEquals(4, t.get(0, 1));
        assertEquals(2, t.get(1, 0));
        assertEquals(6, t.get(2, 1));
    }

    @Test
    void deepCopyIndependence() {
        int[][] source = {{1, 2}, {3, 4}};
        Task43 m = new Task43(source);
        source[0][0] = 99;
        assertEquals(1, m.get(0, 0));
    }

    @Test
    void equalsByContent() {
        Task43 a = new Task43(new int[][]{{1, 2}, {3, 4}});
        Task43 b = new Task43(new int[][]{{1, 2}, {3, 4}});
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void notEqualsDifferentContent() {
        Task43 a = new Task43(new int[][]{{1, 2}, {3, 4}});
        Task43 b = new Task43(new int[][]{{1, 2}, {3, 5}});
        assertNotEquals(a, b);
    }

    @Test
    void toStringHasPrefix() {
        Task43 m = new Task43(new int[][]{{1, 2}, {3, 4}});
        assertTrue(m.toString().startsWith("Matrix"));
    }
}
