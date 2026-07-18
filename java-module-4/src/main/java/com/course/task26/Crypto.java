package com.course.task26;

/**
 * Криптоплатёж — есть минимальный порог суммы.
 */
public class Crypto extends PaymentProcessor {

  @Override
  public boolean process(long amount) {
    return amount >= 1000L;
  }
}
