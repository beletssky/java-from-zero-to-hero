package com.course.task28;

/**
 * Абстрактный документ.
 * Определяет контракт расширения файла и шаблонный метод полного имени.
 */
public abstract class Document {
    protected String title;

    public Document(String title) {
        // TODO: реализуй
        this.title = title;
    }

    public String getTitle() {
        // TODO: реализуй
        return title;
    }

    public abstract String getExtension();

    public String getFullName() {
        // TODO: реализуй
        return title + '.' + getExtension();
    }
}
