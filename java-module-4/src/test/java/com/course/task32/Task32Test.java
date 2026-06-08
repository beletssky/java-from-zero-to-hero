package com.course.task32;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task32Test {

    @Test
    void englishNameReturnsJohn() {
        English e = new English();
        assertEquals("John", e.name());
    }

    @Test
    void englishGreetUsesDefaultMethod() {
        English e = new English();
        assertEquals("Hello, John", e.greet());
    }

    @Test
    void germanNameReturnsHans() {
        German g = new German();
        assertEquals("Hans", g.name());
    }

    @Test
    void germanGreetOverridesDefault() {
        German g = new German();
        assertEquals("Hallo, Hans", g.greet());
    }

    @Test
    void polymorphicGreeterReferences() {
        Greeter en = new English();
        Greeter de = new German();
        assertEquals("Hello, John", en.greet());
        assertEquals("Hallo, Hans", de.greet());
    }
}
