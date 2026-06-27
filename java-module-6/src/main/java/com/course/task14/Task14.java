package com.course.task14;

import java.util.HashSet;
import java.util.Set;

/**
 * Task14: набор разрешений (Permission) с операциями grant/revoke/has/size.
 * Дубликаты по (resource, action) поглощаются благодаря equals/hashCode в Permission.
 */
public class Task14 {

  private Set<Permission> perms = new HashSet<>();

  public void grant(Permission p) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public void revoke(Permission p) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public boolean has(Permission p) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public int size() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
