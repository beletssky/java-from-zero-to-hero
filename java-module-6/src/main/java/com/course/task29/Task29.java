package com.course.task29;

import java.util.Iterator;
import java.util.List;

/**
 * Безопасное удаление элементов из списка через Iterator.
 * Удаляет строки короче minLen, избегая ConcurrentModificationException.
 */
public class Task29 {

  public void removeShort(List<String> input, int minLen) {
    // TODO: реализуй
    Iterator<String> it = input.iterator();

    while (it.hasNext()) {
      String item = it.next();
      if (item == null) {
        it.remove();
        continue;
      }
      if (item.length() < minLen) {
        it.remove();
      }
    }

  }
}
