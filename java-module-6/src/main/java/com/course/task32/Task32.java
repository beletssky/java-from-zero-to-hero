package com.course.task32;

import java.util.Collection;

public class Task32 {

  public String describe(Collection<String> c) {
    if (c.isEmpty()) {
      return "Collection is empty";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("Collection size=").append(c.size()).append(", items: [");

    boolean isFirst = true; // Флаг для первой итерации

    // Обычный цикл. Итератор работает под капотом невидимо для нас.
    for (String item : c) {
      if (!isFirst) {
        sb.append(", "); // Ставим запятую перед всеми элементами, КРОМЕ первого
      }
      sb.append(item);
      isFirst = false; // После первого круга флаг падает навсегда
    }

    sb.append("]");
    return sb.toString();
  }
}