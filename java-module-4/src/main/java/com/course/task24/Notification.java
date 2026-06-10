package com.course.task24;

/**
 * Абстрактное уведомление.
 * Задаёт контракт отправки сообщения получателю.
 */
public abstract class Notification {
  protected String recipient;

  public Notification(String recipient) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getRecipient() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract String send(String message);
}
