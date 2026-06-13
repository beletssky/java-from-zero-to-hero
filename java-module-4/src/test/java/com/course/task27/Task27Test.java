package com.course.task27;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

  @Test
  void usernameGetterViaSubclass() {
    User u = new Admin("root");
    assertEquals("root", u.getUsername());
  }

  @Test
  void adminDiscountIsFifty() {
    Admin a = new Admin("root");
    assertEquals(50, a.getDiscountPercent());
  }

  @Test
  void customerDiscountIsTen() {
    Customer c = new Customer("alice");
    assertEquals(10, c.getDiscountPercent());
  }

  @Test
  void customerUsernameGetterViaSubclass() {
    User u = new Customer("bob");
    assertEquals("bob", u.getUsername());
  }

  @Test
  void polymorphicUserArrayReportsCorrectDiscount() {
    User[] users = { new Admin("root"), new Customer("alice") };
    assertEquals(50, users[0].getDiscountPercent());
    assertEquals(10, users[1].getDiscountPercent());
  }
}
