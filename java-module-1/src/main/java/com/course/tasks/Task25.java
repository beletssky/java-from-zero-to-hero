package com.course.tasks;

public class Task25 {

    /**
     * Возвращает true, если n — простое число.
     * Примеры: isPrime(2) == true; isPrime(15) == false; isPrime(1) == false; isPrime(-7) == false.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
