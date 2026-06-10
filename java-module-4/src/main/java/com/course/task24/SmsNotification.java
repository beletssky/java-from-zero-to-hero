package com.course.task24;

/**
 * SMS-уведомление.
 */
public class SmsNotification extends Notification {

    public SmsNotification(String recipient) {
        super(recipient);
        // TODO: реализуй
    }

    @Override
    public String send(String message) {
        // TODO: реализуй
        return "[SMS to " + recipient + "] " + message;
    }
}
