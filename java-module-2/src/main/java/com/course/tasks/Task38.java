package com.course.tasks;

public class Task38 {

    /**
     * Возвращает массив длины 10, где a[i] — сколько раз цифра i встречается в |n|.
     * Знак числа игнорируется. Для 0 цифра 0 встречается один раз.
     * <p>UA: Повертає масив довжини 10, де a[i] — скільки разів цифра i трапляється в |n|.
     * Знак числа ігнорується. Для 0 цифра 0 трапляється один раз.
     * Примеры: countDigitFrequency(112233) == {0,2,2,2,0,0,0,0,0,0};
     * countDigitFrequency(0) == {1,0,0,0,0,0,0,0,0,0}.
     */
    public static int[] countDigitFrequency(int n) {
        // TODO: реализуй
        int[] frequencies = new int[10];
        if (n == 0) {
            frequencies[0] = 1;
        }
        int positive = Math.abs(n);
        while (positive > 0) {
            int index = positive % 10;
            frequencies[index]++;
            positive /= 10;
        }
        return frequencies;
    }
}
