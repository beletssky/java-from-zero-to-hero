package com.course.task29;

import java.util.Iterator;
import java.util.List;

/**
 * Безопасное удаление элементов из списка через Iterator.
 * Удаляет строки короче minLen, избегая ConcurrentModificationException.
 */
public class Task29 {

  public void removeShort(List<String> input, int minLen) {
    Iterator<String> iterator = input.iterator();

    while (iterator.hasNext()) {
      String currentString =  iterator.next();
      if (currentString.length() < minLen) {
        iterator.remove();
      }
    }
  }
}
