package com.course.tasks;

public class Task13 {

    public static boolean isTriangle(int a, int b, int c) {
        // Твои проверки на ноль и отрицательные числа оставляем как есть
        if (a <= 0) {
            return false;
        }
        if (b <= 0) {
            return false;
        }
        if (c <= 0) {
            return false;
        }

        if (a + b > c) {
            if (a + c > b) {
                if (c + b > a) {
                    return true;
                }
            }
        }

        return false;
    }
}