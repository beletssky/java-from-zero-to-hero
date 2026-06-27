package com.course.task26;

/**
 * Платёж картой — есть лимит на одну операцию.
 */
public class Card extends PaymentProcessor {

  @Override
  public boolean process(long amount) {
    return amount <= 100000L;
  }
}
