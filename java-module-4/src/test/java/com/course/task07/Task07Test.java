package com.course.task07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task07Test {

    @Test
    void bookConstructorSetsFields() {
        Book b = new Book("Война и мир", "Толстой");
        assertEquals("Война и мир", b.getTitle());
        assertEquals("Толстой", b.getAuthor());
    }

    @Test
    void bookInfoReturnsTitleAndAuthor() {
        Book b = new Book("1984", "Orwell");
        assertEquals("1984 by Orwell", b.getInfo());
    }

    @Test
    void eBookConstructorSetsAllFields() {
        EBook e = new EBook("Dune", "Herbert", 12L);
        assertEquals("Dune", e.getTitle());
        assertEquals("Herbert", e.getAuthor());
        assertEquals(12L, e.getSizeMb());
    }

    @Test
    void eBookInfoOverridesParent() {
        EBook e = new EBook("Dune", "Herbert", 12L);
        assertEquals("Dune by Herbert (12 MB)", e.getInfo());
    }

    @Test
    void polymorphicReferenceCallsOverriddenInfo() {
        Book b = new EBook("Foundation", "Asimov", 8L);
        assertEquals("Foundation by Asimov (8 MB)", b.getInfo());
    }
}
