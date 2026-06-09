package com.course.task28;

/**
 * PDF-документ.
 */
public class PdfDoc extends Document {

    public PdfDoc(String title) {
        super(title);
        // TODO: реализуй
    }

    @Override
    public String getExtension() {
        // TODO: реализуй
        return "pdf";
    }
}
