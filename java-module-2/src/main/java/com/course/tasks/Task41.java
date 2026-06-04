package com.course.tasks;

public class Task41 {

    /**
     * Заменяет каждое слово из массива badWords на звёздочки той же длины.
     * Слова в строке разделены одиночными пробелами, сравнение регистронезависимое.
     * <p>UA: Замінює кожне слово з масиву badWords на зірочки тієї ж довжини.
     * Слова в рядку розділені одиночними пробілами, порівняння без урахування регістру.
     * Примеры: censorWords("hello bad world", {"bad"}) == "hello *** world";
     * censorWords("Java IS cool", {"is"}) == "Java ** cool".
     */
    public static String censorWords(String s, String[] badWords) {
        // TODO: реализуй
        if (s == null) {
            throw new IllegalArgumentException();
        }
        if (s.isBlank()) {
            return "";
        }
        String[] lowerBadWords = new String[badWords.length];

        for (int i = 0; i < badWords.length; i++) {
            if (badWords[i] != null) {
                lowerBadWords[i] = badWords[i].toLowerCase();
            }
        }

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentWordLower = words[i].toLowerCase();

            for (String badWord : lowerBadWords) {
                if (currentWordLower.equals(badWord)) {
                    words[i] = "*".repeat(words[i].length());
                    break;
                }
            }
        }

        return String.join(" ", words);
    }
}
