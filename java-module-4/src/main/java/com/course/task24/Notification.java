package com.course.task24;

/**
 * Абстрактное уведомление.
 * Задаёт контракт отправки сообщения получателю.
 */
public abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        // TODO: реализуй
        this.recipient = recipient;
    }

    public String getRecipient() {
        // TODO: реализуй
        return recipient;
    }

    public abstract String send(String message);
}
