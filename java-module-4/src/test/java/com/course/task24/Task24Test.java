package com.course.task24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

  @Test
  void recipientGetterViaSubclass() {
    Notification n = new EmailNotification("alice@example.com");
    assertEquals("alice@example.com", n.getRecipient());
  }

  @Test
  void emailNotificationSendFormatsCorrectly() {
    EmailNotification e = new EmailNotification("alice@example.com");
    assertEquals("[EMAIL to alice@example.com] hello", e.send("hello"));
  }

  @Test
  void smsNotificationSendFormatsCorrectly() {
    SmsNotification s = new SmsNotification("+1234567890");
    assertEquals("[SMS to +1234567890] hi", s.send("hi"));
  }

  @Test
  void pushNotificationSendFormatsCorrectly() {
    PushNotification p = new PushNotification("device-1");
    assertEquals("[PUSH to device-1] ping", p.send("ping"));
  }

  @Test
  void polymorphicNotificationArraySendsViaCorrectChannel() {
    Notification[] all = {
        new EmailNotification("a@b.com"),
        new SmsNotification("+1"),
        new PushNotification("dev")
    };
    assertEquals("[EMAIL to a@b.com] x", all[0].send("x"));
    assertEquals("[SMS to +1] x", all[1].send("x"));
    assertEquals("[PUSH to dev] x", all[2].send("x"));
  }
}
