package com.course.task21;

import java.util.HashMap;
import java.util.Map;

/**
 * Task21 (PhoneBook): телефонная книга имя -> телефон.
 * Поддерживает добавление, поиск по имени, удаление и обратный поиск по номеру.
 */
public class Task21 {

  private Map<String, String> phones = new HashMap<>();

  public void add(String name, String phone) {
    phones.put(name, phone);
  }

  public String find(String name) {
    return phones.get(name);
  }

  public void removeByName(String name) {
    phones.remove(name);
  }

  public String findByPhone(String phone) {
    for (Map.Entry<String, String> entry : phones.entrySet()) {
      if (entry.getValue().equals(phone)) {
        return entry.getKey();
      }
    }
    return null;
  }
}
