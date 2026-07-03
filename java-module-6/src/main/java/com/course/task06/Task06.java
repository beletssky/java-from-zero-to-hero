package com.course.task06;

import java.util.ArrayList;
import java.util.List;

/**
 * Разворот списка чисел.
 * Поддерживает два режима: возврат нового списка и разворот на месте.
 */
public class Task06 {

  public List<Integer> reverse(List<Integer> input) {
    List<Integer> result = new ArrayList<>();
    for (int i = input.size() - 1; i >= 0; i--) {
      result.add(input.get(i));
    }
    return result;
  }

  public void reverseInPlace(List<Integer> input) {
    int left = 0;
    int right =  input.size() - 1;
    while (left < right) {
      int temp = input.get(left);
      input.set(left, input.get(right));
      input.set(right, temp);
      left++;
      right--;
    }
  }
}
