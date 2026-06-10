package com.course.task18;

/**
 * Зоопарк.
 * Собирает звуки всех животных в массив с сохранением порядка.
 */
public class Zoo {

    public String[] makeAllSounds(Animal[] animals) {
        // TODO: реализуй
        String[] sounds = new String[animals.length];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                sounds[i] = animals[i].sound();
            } else {
                sounds[i] = "";
            }
        }

        return sounds;

    }
}
