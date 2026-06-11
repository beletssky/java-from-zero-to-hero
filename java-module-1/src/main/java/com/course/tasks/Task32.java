package com.course.tasks;

public class Task32 {

    /**
     * Классический FizzBuzz для 1..n: %3 → "Fizz", %5 → "Buzz", %15 → "FizzBuzz",
     * иначе — само число. Строки разделены '\n', последняя без '\n'.
     * При n &lt;= 0 — пустая строка.
     */
    public static String fizzBuzz(int n) {

        if (n <= 0) {
            return "";
        }

        String result = "";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result += "FizzBuzz";
            } else if (i % 3 == 0) {
                result += "Fizz";
            } else if (i % 5 == 0) {
                result += "Buzz";
            } else {
                result += i;
            }
            if (i < n) {
                result += "\n";
            }
        }
        return result;
    }
}