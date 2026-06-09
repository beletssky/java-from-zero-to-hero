package com.course.tasks;

public class Task31 {

    /**
     * Возвращает true, если n — палиндром (читается одинаково с обоих концов).
     * Отрицательные числа НЕ являются палиндромами.
     * Примеры: isPalindrome(121) == true; isPalindrome(-121) == false; isPalindrome(10) == false; isPalindrome(0) == true.
     */
    public static boolean isPalindrome(int n) {
        // TODO: реализуй
        if (n < 0) {
            return false;
        }
        String original = String.valueOf(n);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
