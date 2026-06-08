package com.course.task28;

/**
 * Абстрактный документ.
 * Определяет контракт расширения файла и шаблонный метод полного имени.
 */
public abstract class Document {
  protected String title;

  public Document(String title) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getTitle() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract String getExtension();

  public String getFullName() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
