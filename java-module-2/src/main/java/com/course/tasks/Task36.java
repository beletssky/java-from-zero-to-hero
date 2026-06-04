package com.course.tasks;

public class Task36 {

    /**
     * Возвращает массив из 3-х элементов: [min, max, avg], где avg —
     * среднее арифметическое, округлённое до ближайшего целого (Math.round).
     * Для {@code null} или пустого массива — IllegalArgumentException.
     * <p>UA: Повертає масив із 3 елементів: [min, max, avg], де avg —
     * середнє арифметичне, округлене до найближчого цілого (Math.round).
     * Для {@code null} або порожнього масиву — IllegalArgumentException.
     * Примеры: minMaxAvg({3,1,5,2,4}) == {1,5,3};
     * minMaxAvg({10}) == {10,10,10}.
     */
    public static int[] minMaxAvg(int[] a) {
        // TODO: реализуй
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException();
        }
        int min = a[0];
        int max = a[0];
        long sum = 0;
        int avg;
        for (int j : a) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
            sum += j;
        }
        avg = (int) Math.round((double) sum / a.length);
        return new int[]{min, max, avg};
    }
}
