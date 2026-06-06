package com.course.tasks;

public class Task22 {

    /**
     * Возвращает количество цифр в |n|.
     * Примеры: countDigits(0) == 1; countDigits(123) == 3; countDigits(-45) == 2.
     */
    public static int countDigits(int n) {
        // TODO: реализуй
        String number = String.valueOf(n);
        return n < 0 ? number.length() - 1 : number.length();
    }
}
