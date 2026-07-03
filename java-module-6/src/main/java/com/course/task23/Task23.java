package com.course.task23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Task23 (SettingsStore): простое хранилище настроек ключ -> значение.
 * Возвращает копию набора ключей, исходное хранилище не открывает наружу.
 */
public class Task23 {

  private Map<String, String> settings = new HashMap<>();

  public void set(String key, String value) {
    settings.put(key, value);
  }

  public String get(String key) {
    return settings.get(key);
  }

  public String getOrDefault(String key, String def) {
    return settings.getOrDefault(key, def);
  }

  public void remove(String key) {
    settings.remove(key);
  }

  public Set<String> keys() {
    return Set.copyOf(settings.keySet());
  }
}
