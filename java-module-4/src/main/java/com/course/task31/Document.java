package com.course.task31;

/**
 * Документ, поддерживающий сохранение и загрузку.
 */
public class Document implements Savable, Loadable {
    private String content;

    public Document(String content) {
        // TODO: реализуй
        this.content = content;
    }

    public String getContent() {
        // TODO: реализуй
        return content;
    }

    @Override
    public String save() {
        // TODO: реализуй
        return "saving '" + content + "'";
    }

    @Override
    public String load() {
        // TODO: реализуй
        return content;
    }
}
