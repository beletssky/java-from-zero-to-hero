package com.course.tasks;

import java.util.Objects;

public class Task33 {

    /**
     * Возвращает самое частое слово в строке. Слова разделены пробелами,
     * регистр не важен (приводи к lowercase). При равенстве частот —
     * слово, встретившееся первым.
     * Для {@code null} или пустой/состоящей из пробелов строки — IllegalArgumentException.
     * Пример: mostFrequentWord("the cat and the dog") == "the".
     */
    public static String mostFrequentWord(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException();
        }

        String[] words = s.toLowerCase().split(" ");

        int index = 0;
        int repeatsMax = 0;

        for (int i = 0; i < words.length; i++) {
            int quantity = 0;


            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    quantity++;
                }
            }

            if (repeatsMax < quantity) {
                repeatsMax = quantity;
                index = i;
            }

        }

        return words[index];
    }
}
