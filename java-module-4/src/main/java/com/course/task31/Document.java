package com.course.task31;

/**
 * Документ, поддерживающий сохранение и загрузку.
 */
public class Document implements Saveable, Loadable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String save() {
        return "saving '" + content + "'";
    }

    @Override
    public String load() {
        return content;
    }
}
