package com.course.task38;

/**
 * Гонка — выбирает самое быстрое транспортное средство из массива.
 */
public class Race {

    public Vehicle fastest(Vehicle[] vehicles) {
        if (vehicles == null || vehicles.length == 0) {
            return null;
        }

        Vehicle leader = vehicles[0];
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].maxSpeed() > leader.maxSpeed()) {
                leader = vehicles[i];
            }
        }
        return leader;
    }
}
