package com.course.task36;

/**
 * Абстрактное млекопитающее.
 * Добавляет количество ног и общее описание.
 */
public abstract class Mammal extends Animal {
    protected int legs;

    public Mammal(String name, int legs) {
        super(name);
        // TODO: реализуй
        this.legs = legs;
    }

    public int getLegs() {
        // TODO: реализуй
        return legs;
    }

    public String describe() {
        // TODO: реализуй
        return "Mammal with " + legs + " legs, says " + sound();
    }
}
