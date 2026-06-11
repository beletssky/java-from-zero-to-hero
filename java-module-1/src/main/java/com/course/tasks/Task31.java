package com.course.tasks;

public class Task31 {

    /**
     * Возвращает true, если n — палиндром (читается одинаково с обоих концов).
     * Отрицательные числа НЕ являются палиндромами.
     * Примеры: isPalindrome(121) == true; isPalindrome(-121) == false; isPalindrome(10) == false; isPalindrome(0) == true.
     */
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int i = n % 10;
            reversed = reversed * 10 + i;
            n = n / 10;
        }
        return reversed == original;
    }
}
