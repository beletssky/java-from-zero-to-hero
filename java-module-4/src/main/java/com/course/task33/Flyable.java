package com.course.task33;

/**
 * Интерфейс для летающих объектов с default-методом fly().
 */
public interface Flyable {
    default String fly() {
        return "flying";
    }
}
