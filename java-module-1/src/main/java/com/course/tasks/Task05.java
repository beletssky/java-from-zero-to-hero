package com.course.tasks;

public class Task05 {
    public static int unboxAndAdd(Integer a, int b) {
        if (a == null) {
            throw new NullPointerException("a is null");
        };
    return a +b;
    }
}

/**
 * Распаковывает Integer и складывает с int.
 * Если a == null — бросает NullPointerException("a is null").
 * Пример: unboxAndAdd(7, 3) == 10.
 */