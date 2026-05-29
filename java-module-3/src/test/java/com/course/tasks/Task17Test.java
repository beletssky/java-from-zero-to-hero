package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void constructor_setsAllFields() {
        Task17 d = new Task17(5, 3, 2024);
        assertEquals(5, d.getDay());
        assertEquals(3, d.getMonth());
        assertEquals(2024, d.getYear());
    }

    @Test
    void setDay_updatesValue() {
        Task17 d = new Task17(5, 3, 2024);
        d.setDay(15);
        assertEquals(15, d.getDay());
    }

    @Test
    void setMonth_updatesValue() {
        Task17 d = new Task17(5, 3, 2024);
        d.setMonth(11);
        assertEquals(11, d.getMonth());
    }

    @Test
    void setYear_updatesValue() {
        Task17 d = new Task17(5, 3, 2024);
        d.setYear(2000);
        assertEquals(2000, d.getYear());
    }

    @Test
    void constructor_acceptsLeapDay() {
        Task17 d = new Task17(29, 2, 2024); // 2024 is leap year
        assertEquals(29, d.getDay());
    }

    @Test
    void constructor_throwsForNonLeapFeb29() {
        assertThrows(IllegalArgumentException.class, () -> new Task17(29, 2, 2023));
    }

    @Test
    void constructor_throwsForInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> new Task17(1, 13, 2024));
    }

    @Test
    void constructor_throwsForInvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> new Task17(1, 1, 1800));
    }

    @Test
    void setDay_throwsForInvalidDayInMonth() {
        Task17 d = new Task17(1, 4, 2024); // April has 30 days
        assertThrows(IllegalArgumentException.class, () -> d.setDay(31));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task17 a = new Task17(5, 3, 2024);
        Task17 b = new Task17(5, 3, 2024);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task17 a = new Task17(5, 3, 2024);
        Task17 b = new Task17(6, 3, 2024);
        assertNotEquals(a, b);
    }

    @Test
    void toString_returnsFormattedDate() {
        Task17 d = new Task17(5, 3, 2024);
        assertEquals("05.03.2024", d.toString());
        assertTrue(d.toString().contains("."));
    }
}
