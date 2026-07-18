package com.course.task18;

import java.util.HashSet;
import java.util.Set;

/**
 * Task18: VoterRegistry — реестр проголосовавших.
 * vote() возвращает true только при первом голосе данного userId, иначе false.
 */
public class Task18 {

  private Set<String> voted = new HashSet<>();

  public boolean vote(String userId) {
    return voted.add(userId);
  }

  public boolean hasVoted(String userId) {
    return voted.contains(userId);
  }

  public int count() {
    return voted.size();
  }
}
