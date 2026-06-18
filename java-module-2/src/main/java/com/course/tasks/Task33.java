package com.course.tasks;

public class Task33 {

    /**
     * Возвращает самое частое слово в строке. Слова разделены пробелами,
     * регистр не важен (приводи к lowercase). При равенстве частот —
     * слово, встретившееся первым.
     * Для {@code null} или пустой/состоящей из пробелов строки — IllegalArgumentException.
     * Пример: mostFrequentWord("the cat and the dog") == "the".
     */
    public static String mostFrequentWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("NOOO");
        }
        String[] words = s.trim().toLowerCase().split("\\s+");
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueWords[j].equals(currentWord)) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = currentWord;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        int maxCount = 0;
        String mostFrequent = null;
        for (int i = 0; i < uniqueCount; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostFrequent = uniqueWords[i];
            }
        }
        return mostFrequent;
    }
}
