package com.course.task24;

/**
 * Push-уведомление.
 */
public class PushNotification extends Notification {

  public PushNotification(String recipient) {
    super(recipient);
  }

  @Override
  public String send(String message) {
    return "[PUSH to " + recipient + "] " + message;
  }
}
