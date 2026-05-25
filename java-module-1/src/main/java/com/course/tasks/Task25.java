package com.course.tasks;

public class Task25 {

    /**
     * Возвращает true, если n — простое число.
     * Примеры: isPrime(2) == true; isPrime(15) == false; isPrime(1) == false; isPrime(-7) == false.
     */
    public static boolean isPrime(int n) {
        // TODO: реализуй
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
