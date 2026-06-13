package com.course.task24;

/**
 * SMS-уведомление.
 */
public class SmsNotification extends Notification {

  public SmsNotification(String recipient) {
    super(recipient);
  }

  @Override
  public String send(String message) {
    return message;
  }
}
