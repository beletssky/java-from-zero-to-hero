package com.course.task10;

import java.util.ArrayList;
import java.util.List;

/**
 * Постраничная разбивка списка строк.
 * Номера страниц с 1; вне диапазона — пустой список; последняя страница может быть короче.
 */
public class Task10 {

    public List<String> page(List<String> input, int pageNum, int pageSize) {
        // TODO: реализуй
        if (input == null || pageNum < 1 || pageSize <= 0) {
            return new ArrayList<>();
        }

        int fromIndex = (pageNum - 1) * pageSize;

        if (fromIndex >= input.size()) {
            return new ArrayList<>();
        }

        int toIndex = Math.min(fromIndex + pageSize, input.size());
        return new ArrayList<>(input.subList(fromIndex, toIndex));
    }
}
