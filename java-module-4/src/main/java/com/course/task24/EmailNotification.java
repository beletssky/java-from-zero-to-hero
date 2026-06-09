package com.course.task24;

/**
 * Уведомление по электронной почте.
 */
public class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient);
        // TODO: реализуй
    }

    @Override
    public String send(String message) {
        // TODO: реализуй
        return "[EMAIL to " + recipient + "] " + message;
    }
}
