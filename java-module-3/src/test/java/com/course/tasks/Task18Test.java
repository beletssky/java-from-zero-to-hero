package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void constructor_setsAllFields() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        assertEquals("https", u.getProtocol());
        assertEquals("example.com", u.getHost());
        assertEquals(8080, u.getPort());
        assertEquals("/path", u.getPath());
    }

    @Test
    void setPort_updatesValue() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        u.setPort(443);
        assertEquals(443, u.getPort());
    }

    @Test
    void setPath_updatesValue() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        u.setPath("/new");
        assertEquals("/new", u.getPath());
    }

    @Test
    void constructor_throwsForBadProtocol() {
        assertThrows(IllegalArgumentException.class, () -> new Task18("ftp", "example.com", 8080, "/path"));
    }

    @Test
    void constructor_throwsForEmptyHost() {
        assertThrows(IllegalArgumentException.class, () -> new Task18("https", "", 8080, "/path"));
    }

    @Test
    void setPort_throwsForOutOfRange() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        assertThrows(IllegalArgumentException.class, () -> u.setPort(70000));
    }

    @Test
    void setPath_throwsForMissingLeadingSlash() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        assertThrows(IllegalArgumentException.class, () -> u.setPath("nopath"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task18 a = new Task18("https", "example.com", 8080, "/path");
        Task18 b = new Task18("https", "example.com", 8080, "/path");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task18 a = new Task18("https", "example.com", 8080, "/path");
        Task18 b = new Task18("https", "other.com", 8080, "/path");
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsHostAndPort() {
        Task18 u = new Task18("https", "example.com", 8080, "/path");
        String s = u.toString();
        assertTrue(s.contains("example.com"));
        assertTrue(s.contains("8080"));
    }
}
