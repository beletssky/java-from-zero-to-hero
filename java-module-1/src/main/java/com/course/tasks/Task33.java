package com.course.tasks;

public class Task33 {

    /**
     * Возвращает массив из трёх элементов по возрастанию, БЕЗ Arrays.sort.
     * Примеры: sortThreeAsc(3,1,2) == {1,2,3}; sortThreeAsc(5,5,1) == {1,5,5}.
     */
    public static int[] sortThreeAsc(int a, int b, int c) {
        int[] result = new int[3];
        int temp = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        result[0] = a;
        result[1] = b;
        result[2] = c;

        return result;
    }
}
