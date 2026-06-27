package com.course.task28;

/**
 * Текстовый документ (txt).
 */
public class TextDoc extends Document {

  public TextDoc(String title) {
    super(title);
  }

  @Override
  public String getExtension() {
    return "txt";
  }
}
