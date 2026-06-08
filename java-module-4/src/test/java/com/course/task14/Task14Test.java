package com.course.task14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task14Test {

  @Test
  void baseValidatorRejectsNullAndEmpty() {
    BaseValidator v = new BaseValidator();
    assertFalse(v.validate(null));
    assertFalse(v.validate(""));
    assertTrue(v.validate("anything"));
  }

  @Test
  void emailValidatorRejectsNull() {
    EmailValidator ev = new EmailValidator();
    assertFalse(ev.validate(null));
  }

  @Test
  void emailValidatorRejectsEmptyAndWithoutAt() {
    EmailValidator ev = new EmailValidator();
    assertFalse(ev.validate(""));
    assertFalse(ev.validate("a"));
  }

  @Test
  void emailValidatorAcceptsStringWithAt() {
    EmailValidator ev = new EmailValidator();
    assertTrue(ev.validate("a@b"));
  }

  @Test
  void polymorphismViaParentReference() {
    BaseValidator v = new EmailValidator();
    assertFalse(v.validate("noAtSign"));
    assertTrue(v.validate("user@host"));
  }
}
