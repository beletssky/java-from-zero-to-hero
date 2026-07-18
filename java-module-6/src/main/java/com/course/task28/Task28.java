package com.course.task28;

import java.util.Arrays;
import java.util.Objects;

/**
 * Task28 (Anagrams): проверяет, являются ли две строки анаграммами.
 * Регистр и пробелы игнорируются; пустые строки считаются анаграммами друг друга.
 */
public class Task28 {

  public boolean areAnagrams(String a, String b) {
    // TODO: реализуй
    if (a == null || b == null) {
      return Objects.equals(a, b);
    }

    String cleanA = a.toLowerCase().replace(" ", "");
    String cleanB = b.toLowerCase().replace(" ", "");

    if (cleanA.length() != cleanB.length()) {
      return false;
    }

    char[] charsA = cleanA.toCharArray();
    char[] charsB = cleanB.toCharArray();

    Arrays.sort(charsA);
    Arrays.sort(charsB);

    return Arrays.equals(charsA, charsB);
  }
}
