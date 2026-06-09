package com.course.task13;

/**
 * Базовый логгер.
 * Добавляет к сообщению префикс уровня INFO.
 */
public class Logger {

    public String log(String msg) {
        // TODO: реализуй
        String prefix = "[INFO]";
        return prefix + " " + msg;
    }
}
