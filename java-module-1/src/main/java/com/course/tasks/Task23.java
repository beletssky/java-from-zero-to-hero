package com.course.tasks;

public class Task23 {

    /**
     * Возвращает сумму цифр |n|.
     * Примеры: sumOfDigits(123) == 6; sumOfDigits(-405) == 9; sumOfDigits(0) == 0.
     */
    public static int sumOfDigits(int n) {
        // TODO: реализуй
        String number = String.valueOf(n);
        int sum = 0;
        for (char ch : number.toCharArray()) {
            if (ch == '-') continue;
            sum += ch - '0';
        }
        return sum;
    }
}
