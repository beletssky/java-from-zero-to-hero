package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void constructor_setsAllFields() {
        Task15 p = new Task15("Milk", 2500, 10);
        assertEquals("Milk", p.getName());
        assertEquals(2500, p.getPriceKopecks());
        assertEquals(10, p.getStock());
    }

    @Test
    void setPriceKopecks_updatesValue() {
        Task15 p = new Task15("Milk", 2500, 10);
        p.setPriceKopecks(3000);
        assertEquals(3000, p.getPriceKopecks());
    }

    @Test
    void setStock_updatesValue() {
        Task15 p = new Task15("Milk", 2500, 10);
        p.setStock(20);
        assertEquals(20, p.getStock());
    }

    @Test
    void sell_reducesStock() {
        Task15 p = new Task15("Milk", 2500, 10);
        p.sell(3);
        assertEquals(7, p.getStock());
    }

    @Test
    void sell_throwsForInsufficientStock() {
        Task15 p = new Task15("Milk", 2500, 10);
        assertThrows(IllegalArgumentException.class, () -> p.sell(20));
    }

    @Test
    void restock_increasesStock() {
        Task15 p = new Task15("Milk", 2500, 10);
        p.restock(5);
        assertEquals(15, p.getStock());
    }

    @Test
    void constructor_throwsForNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> new Task15("Milk", -1, 10));
    }

    @Test
    void setStock_throwsForNegative() {
        Task15 p = new Task15("Milk", 2500, 10);
        assertThrows(IllegalArgumentException.class, () -> p.setStock(-1));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task15 a = new Task15("Milk", 2500, 10);
        Task15 b = new Task15("Milk", 2500, 10);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task15 a = new Task15("Milk", 2500, 10);
        Task15 b = new Task15("Bread", 2500, 10);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task15 p = new Task15("Milk", 2500, 10);
        String s = p.toString();
        assertTrue(s.contains("Product"));
        assertTrue(s.contains("Milk"));
        assertTrue(s.contains("2500"));
        assertTrue(s.contains("10"));
    }
}
