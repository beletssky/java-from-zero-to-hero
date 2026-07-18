package com.course.task32;

/**
 * Интерфейс приветствия с default-методом greet().
 */
public interface Greeter {
    String name();

    default String greet() {
        return "Hello, " + name();
    }
}
