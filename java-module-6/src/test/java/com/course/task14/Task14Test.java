package com.course.task14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Task14Test {

  @Test
  void grantAddsPermissionAndHasReturnsTrue() {
    Task14 t = new Task14();
    Permission p = new Permission("file", "read");
    t.grant(p);
    assertTrue(t.has(p));
    assertEquals(1, t.size());
  }

  @Test
  void duplicatePermissionsCollapseToOneEntry() {
    Task14 t = new Task14();
    Permission p1 = new Permission("file", "read");
    Permission p2 = new Permission("file", "read");
    t.grant(p1);
    t.grant(p2);
    assertEquals(1, t.size());
    assertTrue(t.has(p2));
  }

  @Test
  void revokeRemovesPermission() {
    Task14 t = new Task14();
    Permission p = new Permission("db", "write");
    t.grant(p);
    t.revoke(p);
    assertFalse(t.has(p));
    assertEquals(0, t.size());
  }

  @Test
  void hasReturnsFalseForUngrantedPermission() {
    Task14 t = new Task14();
    t.grant(new Permission("file", "read"));
    assertFalse(t.has(new Permission("file", "write")));
  }

  @Test
  void differentResourceOrActionAreSeparateEntries() {
    Task14 t = new Task14();
    t.grant(new Permission("file", "read"));
    t.grant(new Permission("file", "write"));
    t.grant(new Permission("db", "read"));
    assertEquals(3, t.size());
  }

  @Test
  void permissionEqualsAndHashCodeBasedOnBothFields() {
    Permission a = new Permission("file", "read");
    Permission b = new Permission("file", "read");
    Permission c = new Permission("file", "write");
    assertEquals(a, b);
    assertEquals(a.hashCode(), b.hashCode());
    assertNotEquals(a, c);
  }
}
