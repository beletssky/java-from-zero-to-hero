package com.course.task30;

/**
 * Коробка с заданным размером.
 */
public class Box implements Sized {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
