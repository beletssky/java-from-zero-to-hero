package com.course.tasks;

public class Task32 {

    /**
     * Классический FizzBuzz для 1..n: %3 → "Fizz", %5 → "Buzz", %15 → "FizzBuzz",
     * иначе — само число. Строки разделены '\n', последняя без '\n'.
     * При n &lt;= 0 — пустая строка.
     */
    public static String fizzBuzz(int n) {
        // TODO: реализуй
        if (n <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }

            if (i < n) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
