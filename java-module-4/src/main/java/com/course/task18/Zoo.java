package com.course.task18;

/**
 * Зоопарк.
 * Собирает звуки всех животных в массив с сохранением порядка.
 */
public class Zoo {

  public String[] makeAllSounds(Animal[] animals) {
    String[] sounds = new String[animals.length];
      for (int i = 0; i < animals.length; i++) {
        sounds[i] = animals[i].sound();
      }
      return sounds;
  }
}