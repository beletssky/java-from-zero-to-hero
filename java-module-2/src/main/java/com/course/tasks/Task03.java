package com.course.tasks;

public class Task03 {
    /**
     * Конвертирует температуру из градусов Цельсия в Фаренгейты по формуле
     * F = C * 9/5 + 32.
     * Примеры: celsiusToFahrenheit(0) == 32.0; celsiusToFahrenheit(100) == 212.0.
     */
    public static double celsiusToFahrenheit(double c) {
        double f = c * 9.0 / 5 + 32;
        return f;
    }
}