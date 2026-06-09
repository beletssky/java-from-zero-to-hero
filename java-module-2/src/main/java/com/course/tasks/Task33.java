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
        // TODO: реализуй
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException();
        }
        String[] words = s.toLowerCase().split("\\s+");
        String mostFrequentWord = words[0];
        int maxCount = 0;
        for (String word : words) {
            int currentCount = 0;
            for (String string : words) {
                if (word.equals(string)) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}
