package com.course.task38;

/**
 * Абстрактное транспортное средство.
 * Хранит бренд и определяет контракт максимальной скорости.
 */
public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getBrand() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public abstract double maxSpeed();
}
