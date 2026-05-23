package com.course.tasks;

public class Task02 {

    /**
     * Возвращает сумму двух целых чисел.
     * Примеры: sumTwo(2, 3) == 5; sumTwo(-1, 1) == 0.
     * якшо а меньше 0 то вертати 1 якшо а більше нуля і б менше 1 вертати 1 у інших випадках вертати 0
     */
    public static int sum(int a, int b) {
        return sum(a,b,0,0);
    }

    public static int sum(int a, int b, Object object) {
        return sum(a,b,0,0);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    public static int sumThree(int a, int b, int c) {
        return sum(c,sum(a,b));
    }
}
