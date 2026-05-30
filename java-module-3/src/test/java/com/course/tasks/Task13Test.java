package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void constructor_setsAllFields() {
        Task13 t = new Task13(0.0);
        assertEquals(0.0, t.getCelsius(), 1e-9);
    }

    @Test
    void getFahrenheit_converts() {
        Task13 t = new Task13(0.0);
        assertEquals(32.0, t.getFahrenheit(), 1e-9);
        Task13 t2 = new Task13(100.0);
        assertEquals(212.0, t2.getFahrenheit(), 1e-9);
    }

    @Test
    void getKelvin_converts() {
        Task13 t = new Task13(0.0);
        assertEquals(273.15, t.getKelvin(), 1e-9);
    }

    @Test
    void setCelsius_updatesValue() {
        Task13 t = new Task13(0.0);
        t.setCelsius(25.0);
        assertEquals(25.0, t.getCelsius(), 1e-9);
    }

    @Test
    void constructor_throwsForBelowAbsoluteZero() {
        assertThrows(IllegalArgumentException.class, () -> new Task13(-300.0));
    }

    @Test
    void setCelsius_throwsForTooHigh() {
        Task13 t = new Task13(0.0);
        assertThrows(IllegalArgumentException.class, () -> t.setCelsius(1500.0));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task13 a = new Task13(20.0);
        Task13 b = new Task13(20.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task13 a = new Task13(20.0);
        Task13 b = new Task13(21.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task13 t = new Task13(20.0);
        String s = t.toString();
        assertTrue(s.contains("TemperatureSensor"));
        assertTrue(s.contains("20"));
    }
}
