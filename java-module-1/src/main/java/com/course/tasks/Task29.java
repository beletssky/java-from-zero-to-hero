package com.course.tasks;

public class Task29 {

    /**
     * Возвращает таблицу умножения для n: 10 строк вида "n x k = n*k",
     * разделённых '\n', последняя строка без '\n'.
     * Пример: multiplicationTable(2) начинается с "2 x 1 = 2\n2 x 2 = 4\n...".
     */
    public static String multiplicationTable(int n) {
        String result = "";
        for (int k = 1; k <= 10; k++) {
            result = result + n + " x " + k + " = " + (n * k);
            if (k < 10)
                result = result + "\n";

        }
        return result;
    }
}
