package com.course.task08;


import java.util.ArrayList;
import java.util.List;

/**
 * Слияние двух списков чередованием элементов.
 * Если один список длиннее — остаток добавляется в конец.
 */
public class Task08 {

  public List<Integer> merge(List<Integer> a, List<Integer> b) {
    // TODO: реализуй
      if (a == null && b == null) return new ArrayList<>();
      if (a == null) return new ArrayList<>(b);
      if (b == null) return new ArrayList<>(a);

      List<Integer> result = new ArrayList<>();
      int maxLength = Math.max(a.size(), b.size());

      for (int i = 0; i < maxLength; i++) {
          if (i < a.size()) {
              result.add(a.get(i));
          }
          if (i < b.size()) {
              result.add(b.get(i));
          }
      }

      return result;
  }
}
