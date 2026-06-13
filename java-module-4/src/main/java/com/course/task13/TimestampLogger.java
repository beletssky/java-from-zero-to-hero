package com.course.task13;

/**
 * Логгер с временной меткой.
 * Дописывает фиксированную метку времени перед сообщением родителя.
 */
public class TimestampLogger extends Logger {

  @Override
  public String log(String msg) {
    return "1234ms: " + super.log(msg);
  }
}
