package com.course.task36;

/**
 * Абстрактное млекопитающее.
 * Добавляет количество ног и общее описание.
 */
public abstract class Mammal extends Animal {
    protected int legs;

    public Mammal(String name, int legs) {
        super(name);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public String describe() {
        return "Mammal with " + legs + " legs, says " + sound();
    }
}
