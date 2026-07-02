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
        // TODO: реализуй
        phones.put(name, phone);
    }

    public String find(String name) {
        // TODO: реализуй
        return phones.get(name);
    }

    public void removeByName(String name) {
        // TODO: реализуй
        phones.remove(name);
    }

    public String findByPhone(String phone) {
        // TODO: реализуй
        for (Map.Entry<String, String> entry : phones.entrySet()) {
            if (phone.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
