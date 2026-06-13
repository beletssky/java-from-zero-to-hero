package com.course.task45;

/**
 * Сигналы светофора с длительностью в секундах.
 * Каждый сигнал хранит время своего отображения.
 */
public enum Light {
    RED(30), YELLOW(3), GREEN(27);

    private final int seconds;

    Light(int seconds) { this.seconds = seconds; }

    public int getSeconds() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
