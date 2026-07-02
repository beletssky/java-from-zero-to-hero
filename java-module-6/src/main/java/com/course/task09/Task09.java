package com.course.task09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Топ-N наибольших чисел из списка.
 * Возвращает новый список в убывающем порядке, входной не изменяется.
 */
public class Task09 {

    public List<Integer> topN(List<Integer> input, int n) {
        // TODO: реализуй
        if (input == null || n <= 0) return new ArrayList<>();

        List<Integer> sortedInput = new ArrayList<>(input);
        sortedInput.sort(Comparator.reverseOrder());

        if (n > input.size()) return sortedInput;

        return sortedInput.subList(0, n);
    }
}
