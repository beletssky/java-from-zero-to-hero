package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void constructor_setsAllFields() {
        Task11 a = new Task11("Ivan", 1000);
        assertEquals("Ivan", a.getOwner());
        assertEquals(1000, a.getBalance());
    }

    @Test
    void deposit_increasesBalance() {
        Task11 a = new Task11("Ivan", 1000);
        a.deposit(500);
        assertEquals(1500, a.getBalance());
    }

    @Test
    void deposit_throwsForNonPositive() {
        Task11 a = new Task11("Ivan", 1000);
        assertThrows(IllegalArgumentException.class, () -> a.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> a.deposit(-5));
    }

    @Test
    void withdraw_decreasesBalance() {
        Task11 a = new Task11("Ivan", 1000);
        a.withdraw(400);
        assertEquals(600, a.getBalance());
    }

    @Test
    void withdraw_throwsForInsufficientFunds() {
        Task11 a = new Task11("Ivan", 1000);
        assertThrows(IllegalArgumentException.class, () -> a.withdraw(2000));
    }

    @Test
    void withdraw_throwsForNonPositive() {
        Task11 a = new Task11("Ivan", 1000);
        assertThrows(IllegalArgumentException.class, () -> a.withdraw(0));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task11 a = new Task11("Ivan", 1000);
        Task11 b = new Task11("Ivan", 1000);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task11 a = new Task11("Ivan", 1000);
        Task11 b = new Task11("Petro", 1000);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task11 a = new Task11("Ivan", 1000);
        String s = a.toString();
        assertTrue(s.contains("BankAccount"));
        assertTrue(s.contains("Ivan"));
        assertTrue(s.contains("1000"));
    }
}
