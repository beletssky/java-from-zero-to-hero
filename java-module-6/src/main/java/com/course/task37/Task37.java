package com.course.task37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задача 37: сортировка версий по естественному и обратному порядку.
 * Оба метода возвращают новый список, не меняя исходный.
 */
public class Task37 {

    public List<Version> sortNatural(List<Version> input) {
        // TODO: реализуй
        if (input == null) {
            return new ArrayList<>();
        }

        List<Version> result = new ArrayList<>(input);

        Collections.sort(result);

        return result;
    }

    public List<Version> sortDesc(List<Version> input) {
        // TODO: реализуй
        if (input == null) {
            return new ArrayList<>();
        }

        List<Version> result = new ArrayList<>(input);

        result.sort(Collections.reverseOrder());

        return result;
    }
}
