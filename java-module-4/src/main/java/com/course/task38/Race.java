package com.course.task38;

/**
 * Гонка — выбирает самое быстрое транспортное средство из массива.
 */
public class Race {

    public Vehicle fastest(Vehicle[] vehicles) {
        // TODO: реализуй
        Vehicle max = vehicles[0];
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].maxSpeed() > max.maxSpeed()) {
                max = vehicles[i];
            }
        }
        return max;
    }
}
