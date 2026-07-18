package com.course.task16;

import java.util.HashSet;
import java.util.Set;

/**
 * Task16: LetterCounter — множество уникальных букв строки в нижнем регистре.
 * Пробелы пропускаются, null приводит к IllegalArgumentException.
 */
public class Task16 {

    public Set<Character> uniqueLetters(String s) {
        // TODO: реализуй
        if (s == null) {
            throw new IllegalArgumentException();
        }
        Set<Character> result = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            if (ch.equals(' ')) continue;
            result.add(Character.toLowerCase(ch));
        }
        return result;
    }
}
