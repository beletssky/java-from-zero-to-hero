package com.course.task28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

  @Test
  void titleGetterViaSubclass() {
    Document d = new WordDoc("report");
    assertEquals("report", d.getTitle());
  }

  @Test
  void wordDocExtensionIsDocx() {
    WordDoc w = new WordDoc("report");
    assertEquals("docx", w.getExtension());
  }

  @Test
  void pdfDocExtensionIsPdf() {
    PdfDoc p = new PdfDoc("manual");
    assertEquals("pdf", p.getExtension());
  }

  @Test
  void textDocExtensionIsTxt() {
    TextDoc t = new TextDoc("notes");
    assertEquals("txt", t.getExtension());
  }

  @Test
  void getFullNameCombinesTitleAndExtensionForWord() {
    Document d = new WordDoc("report");
    assertEquals("report.docx", d.getFullName());
  }

  @Test
  void getFullNameCombinesTitleAndExtensionForPdfAndText() {
    Document d1 = new PdfDoc("manual");
    Document d2 = new TextDoc("notes");
    assertEquals("manual.pdf", d1.getFullName());
    assertEquals("notes.txt", d2.getFullName());
  }
}
