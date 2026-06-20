package com.course.task28;

/**
 * PDF-документ.
 */
public class PdfDoc extends Document {

  public PdfDoc(String title) {
    super(title);
  }

  @Override
  public String getExtension() {
    return "pdf";
  }
}
