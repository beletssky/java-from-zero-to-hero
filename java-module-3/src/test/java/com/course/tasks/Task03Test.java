package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    @Test
    void constructor_setsAllFields() {
        Task03 b = new Task03("Clean Code", "Robert Martin", 2008);
        assertEquals("Clean Code", b.getTitle());
        assertEquals("Robert Martin", b.getAuthor());
        assertEquals(2008, b.getYear());
    }

    @Test
    void getters_returnValues() {
        Task03 b = new Task03("Effective Java", "Joshua Bloch", 2018);
        assertEquals("Effective Java", b.getTitle());
        assertEquals("Joshua Bloch", b.getAuthor());
        assertEquals(2018, b.getYear());
    }

    @Test
    void constructor_throwsForNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> new Task03(null, "Author", 2000));
    }

    @Test
    void constructor_throwsForBlankAuthor() {
        assertThrows(IllegalArgumentException.class, () -> new Task03("Title", "   ", 2000));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task03 a = new Task03("Clean Code", "Robert Martin", 2008);
        Task03 b = new Task03("Clean Code", "Robert Martin", 2008);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task03 a = new Task03("Clean Code", "Robert Martin", 2008);
        Task03 b = new Task03("Clean Code", "Robert Martin", 2009);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task03("Clean Code", "Robert Martin", 2008).toString();
        assertTrue(s.contains("Book"));
        assertTrue(s.contains("Clean Code"));
        assertTrue(s.contains("Robert Martin"));
        assertTrue(s.contains("2008"));
    }
}
