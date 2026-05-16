package com.course.tasks;

public class Task27 {

    /**
     * НОД (алгоритм Евклида) для |a| и |b|.
     * Примеры: gcd(12, 18) == 6; gcd(7, 13) == 1; gcd(0, 5) == 5; gcd(0, 0) == 0.
     */
    public static int gcd(int a, int b) {
        int lowerNumber = a;
        int higherNumber = b;

        if (a > b){
            lowerNumber = b;
            higherNumber = a;
        }

        while (lowerNumber != 0) {
            int leftover = higherNumber % lowerNumber;
            higherNumber = lowerNumber;
            lowerNumber = leftover;
        }

        higherNumber = higherNumber < 0 ? higherNumber * -1 : higherNumber;

        return higherNumber;
    }
}
