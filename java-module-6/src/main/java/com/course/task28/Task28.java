package com.course.task28;

import javax.print.DocFlavor;

/**
 * Task28 (Anagrams): проверяет, являются ли две строки анаграммами.
 * Регистр и пробелы игнорируются; пустые строки считаются анаграммами друг друга.
 */
public class Task28 {

  public boolean areAnagrams(String a, String b) {
    if (a == null || b == null) {
      return a == b;
    }

    String cleanA = a.replace(" ", "").toLowerCase();
    String cleanB = b.replace(" ", "").toLowerCase();

    if (cleanA.length() != cleanB.length()) {
      return false;
    }

    int[] charCounts = new int[65536];

    for (int i = 0; i < cleanA.length(); i++) {
      charCounts[cleanA.charAt(i)]++;
      charCounts[cleanB.charAt(i)]--;
    }

    for (int count : charCounts) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}
