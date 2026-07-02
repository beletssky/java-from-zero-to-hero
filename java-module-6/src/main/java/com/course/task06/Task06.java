package com.course.task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Разворот списка чисел.
 * Поддерживает два режима: возврат нового списка и разворот на месте.
 */
public class Task06 {

    public List<Integer> reverse(List<Integer> input) {
        // TODO: реализуй
        if (input == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>(input);
        Collections.reverse(result);
        return result;
    }

    public void reverseInPlace(List<Integer> input) {
        // TODO: реализуй
        if (input == null) {
            return;
        }
        Collections.reverse(input);
    }
}
