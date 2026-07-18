package com.course.task34;

import java.util.List;

/**
 * Задача 34: сортировка списка пользователей по возрасту.
 * Использует естественный порядок User (Comparable) и Collections.sort.
 */
public class Task34 {

  public void sortUsers(List<User> users) {
    java.util.Collections.sort(users);
  }
}
