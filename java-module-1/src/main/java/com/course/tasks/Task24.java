package com.course.tasks;

public class Task24 {

    /**
     * Возвращает число, у которого цифры идут в обратном порядке. Знак сохраняется.
     * Примеры: reverseNumber(123) == 321; reverseNumber(-450) == -54; reverseNumber(0) == 0.
     */
    public static int reverseNumber(int n) {
        // TODO: реализуй
        StringBuilder numberBuilder = new StringBuilder(String.valueOf(n));
        boolean isNegative = n < 0;
        if (isNegative) {
            numberBuilder.delete(0, 1);
        }
        String reversedString = numberBuilder.reverse().toString();
        int reversedInt = Integer.parseInt(reversedString);
        return isNegative ? reversedInt * -1 : reversedInt;
    }
}
