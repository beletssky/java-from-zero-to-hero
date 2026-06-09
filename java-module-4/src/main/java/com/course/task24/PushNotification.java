package com.course.task24;

/**
 * Push-уведомление.
 */
public class PushNotification extends Notification {

    public PushNotification(String recipient) {
        super(recipient);
        // TODO: реализуй
    }

    @Override
    public String send(String message) {
        // TODO: реализуй
        return "[PUSH to " + recipient + "] " + message;
    }
}
