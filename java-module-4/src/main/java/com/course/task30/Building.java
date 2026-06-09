package com.course.task30;

/**
 * Здание; размер вычисляется как количество этажей умноженное на 3.
 */
public class Building implements Sized {
    private int floors;

    public Building(int floors) {
        // TODO: реализуй
        this.floors = floors;
    }

    @Override
    public int getSize() {
        // TODO: реализуй
        return floors * 3;
    }
}
