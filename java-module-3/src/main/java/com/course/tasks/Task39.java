package com.course.tasks;

/**
 * UA: Гаманець (Wallet).
 * <p>
 * Вкладений enum {@link Currency}: USD, EUR, UAH.
 * Поля: {@code currency} — незмінне (final); {@code amount} — змінюване (&gt;=0).
 * Конструктор валідовує amount &gt;= 0, інакше IllegalArgumentException.
 * Методи:
 * <ul>
 *   <li>{@link #add(long)} — n &gt; 0 (інакше IAE); amount += n</li>
 *   <li>{@link #withdraw(long)} — n &gt; 0 та amount &gt;= n (інакше IAE); amount -= n</li>
 * </ul>
 * Приклад: new Task39(USD, 100).withdraw(40) дає amount == 60.
 * <p>
 * RU: Кошелёк (Wallet).
 * <p>
 * Вложенный enum {@link Currency}: USD, EUR, UAH.
 * Поля: {@code currency} — неизменяемое (final); {@code amount} — изменяемое (&gt;=0).
 * Конструктор валидирует amount &gt;= 0, иначе IllegalArgumentException.
 * Методы:
 * <ul>
 *   <li>{@link #add(long)} — n &gt; 0 (иначе IAE); amount += n</li>
 *   <li>{@link #withdraw(long)} — n &gt; 0 и amount &gt;= n (иначе IAE); amount -= n</li>
 * </ul>
 * Пример: new Task39(USD, 100).withdraw(40) даёт amount == 60.
 */
public class Task39 {

    /**
     * UA: Валюти: USD, EUR, UAH.
     * RU: Валюты: USD, EUR, UAH.
     */
    public enum Currency {
        USD, EUR, UAH
    }

    /**
     * UA: Валюта (незмінне поле).
     * RU: Валюта (неизменяемое поле).
     */
    private final Currency currency;

    /**
     * UA: Сума &gt;= 0 (змінюване поле).
     * RU: Сумма &gt;= 0 (изменяемое поле).
     */
    private long amount;

    /**
     * UA: Конструктор — задає валюту та суму; валідовує amount &gt;= 0.
     * RU: Конструктор — задаёт валюту и сумму; валидирует amount &gt;= 0.
     */
    public Task39(Currency currency, long amount) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер валюти.
     * RU: Геттер валюты.
     */
    public Currency getCurrency() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер суми.
     * RU: Геттер суммы.
     */
    public long getAmount() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Поповнення: n &gt; 0 (інакше IAE); amount += n.
     * RU: Пополнение: n &gt; 0 (иначе IAE); amount += n.
     */
    public void add(long n) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Зняття: n &gt; 0 та amount &gt;= n (інакше IAE); amount -= n.
     * RU: Снятие: n &gt; 0 и amount &gt;= n (иначе IAE); amount -= n.
     */
    public void withdraw(long n) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
