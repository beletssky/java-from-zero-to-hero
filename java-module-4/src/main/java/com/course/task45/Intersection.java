package com.course.task45;

/**
 * Перекрёсток с одним светофором.
 * Переключает сигналы по циклу RED → GREEN → YELLOW → RED.
 */
public class Intersection {
    private Light current;

    public Intersection(Light start) {
        // TODO: реализуй
        this.current = start;
    }

    public Light getCurrent() {
        // TODO: реализуй
        return this.current;
    }

    public void next() {
        // TODO: реализуй
        switch (current) {
            case RED -> current = Light.GREEN;
            case GREEN -> current = Light.YELLOW;
            case YELLOW -> current = Light.RED;
        }
    }

    public int getCurrentSeconds() {
        // TODO: реализуй
        return this.current.getSeconds();
    }
}
