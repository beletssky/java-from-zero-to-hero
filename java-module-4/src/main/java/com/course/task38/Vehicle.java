package com.course.task38;

/**
 * Абстрактное транспортное средство.
 * Хранит бренд и определяет контракт максимальной скорости.
 */
public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        // TODO: реализуй
        this.brand = brand;
    }

    public String getBrand() {
        // TODO: реализуй
        return brand;
    }

    public abstract double maxSpeed();
}
