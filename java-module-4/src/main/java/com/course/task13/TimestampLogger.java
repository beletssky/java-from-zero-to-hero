package com.course.task13;

/**
 * Логгер с временной меткой.
 * Дописывает фиксированную метку времени перед сообщением родителя.
 */
public class TimestampLogger extends Logger {

    @Override
    public String log(String msg) {
        // TODO: реализуй
        String timeStamp = "1234ms";
        return timeStamp + ": " + super.log(msg);
    }
}
