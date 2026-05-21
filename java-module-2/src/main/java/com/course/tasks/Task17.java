package com.course.tasks;

public class Task17 {

    /**
     * Объединяет два массива в один (a, затем b).
     * Если любой аргумент {@code null} — IllegalArgumentException.
     * Примеры: concat({1,2}, {3,4,5}) == {1,2,3,4,5}; concat({}, {1,2}) == {1,2}.
     */
    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;
        for(int item: a) {
            result [index++] = item;
        }
        for(int item: b) {
            result [index++] = item;
        }
        return result; 
    }
}
