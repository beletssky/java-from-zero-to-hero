package com.course.tasks;

public class Task42 {

    /**
     * Возвращает массив чисел от from до to (не включая to) с шагом step.
     * Если step == 0 — IllegalArgumentException. Если направление шага не
     * совпадает с направлением from→to, возвращается пустой массив.
     * <p>UA: Повертає масив чисел від from до to (не включаючи to) з кроком step.
     * Якщо step == 0 — IllegalArgumentException. Якщо напрямок кроку не
     * збігається з напрямком from→to, повертається порожній масив.
     * Примеры: rangeArray(0, 10, 2) == {0,2,4,6,8};
     * rangeArray(10, 0, -2) == {10,8,6,4,2}.
     */
    public static int[] rangeArray(int from, int to, int step) {
        // TODO: реализуй
        if (step == 0) {
            throw new IllegalArgumentException();
        }
        if (from < to && step < 0) {
            return new int[0];
        }
        if (from > to && step > 0) {
            return new int[0];
        }
        if (from == to) {
            return new int[0];
        }

        int count = Math.round((float) (to - from) / step);
        int[] result = new int[count];
        int current = from;

        for (int i = 0; i < count; i++) {
            result[i] = current;
            current += step;
        }

        return result;
    }
}
