package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Address;
import com.course.model.User;
import org.junit.jupiter.api.Test;

class Task21Test {

  @Test
  void returnsUnknownWhenUserIsNull() {
    assertEquals("город неизвестен", Task21.cityOf(null));
  }

  @Test
  void returnsUnknownWhenAddressIsNull() {
    User user = new User("Anna", null);
    assertEquals("город неизвестен", Task21.cityOf(user));
  }

  @Test
  void returnsUnknownWhenCityIsNull() {
    User user = new User("Anna", new Address(null));
    assertEquals("город неизвестен", Task21.cityOf(user));
  }

  @Test
  void returnsCityWhenAllFieldsPresent() {
    User user = new User("Anna", new Address("Kyiv"));
    assertEquals("Kyiv", Task21.cityOf(user));
  }

  @Test
  void returnsCityForAnotherCityValue() {
    User user = new User("Bob", new Address("Lviv"));
    assertEquals("Lviv", Task21.cityOf(user));
  }

  @Test
  void returnsEmptyStringCityWhenCityIsEmpty() {
    User user = new User("Anna", new Address(""));
    assertEquals("", Task21.cityOf(user));
  }
}
