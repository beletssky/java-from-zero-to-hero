package com.course.task28;

/**
 * Документ Microsoft Word (docx).
 */
public class WordDoc extends Document {

  public WordDoc(String title) {
    super(title);
  }

  @Override
  public String getExtension() {
    return "docx";
  }
}
