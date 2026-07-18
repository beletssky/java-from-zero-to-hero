package com.course.task10;

import java.util.List;
import java.util.ArrayList;

/**
 * Постраничная разбивка списка строк.
 * Номера страниц с 1; вне диапазона — пустой список; последняя страница может быть короче.
 */
public class Task10 {

  public List<String> page(List<String> input, int pageNum, int pageSize) {
    int startIndex = (pageNum - 1) * pageSize;
    if (startIndex >= input.size()) {
      return new ArrayList<>();
    }
    int endIndex = Math.min(startIndex + pageSize, input.size());
    return new ArrayList<>(input.subList(startIndex, endIndex));
  }
}
