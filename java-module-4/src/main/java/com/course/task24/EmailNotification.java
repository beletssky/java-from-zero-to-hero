package com.course.task24;

/**
 * Уведомление по электронной почте.
 */
public class EmailNotification extends Notification {

  public EmailNotification(String recipient) {
    super(recipient);

  }

  @Override
  public String send(String message) {
    return message;
  }
}
