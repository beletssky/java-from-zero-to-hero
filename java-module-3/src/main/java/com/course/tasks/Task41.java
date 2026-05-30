package com.course.tasks;

import java.util.Arrays;
import java.util.Objects;

/**
 * UA: Кошик покупок (ShoppingCart).
 * <p>
 * Вкладений клас {@link Item} описує позицію в кошику: назву ({@code name}),
 * ціну за одиницю в копійках ({@code priceKopecks}) та кількість ({@code qty}).
 * Поля {@code Item} приватні та незмінні (final), є конструктор, геттери,
 * перевизначені {@code toString/equals/hashCode}.
 * <p>
 * Сам кошик зберігає товари у приватному масиві {@code items}, який спочатку
 * порожній (довжина 0) та зростає за допомогою приватного помічника
 * {@code cloneAndExtend}. Масив НЕ final, бо змінюється при додаванні/видаленні.
 * <p>
 * Методи:
 * <ul>
 *   <li>{@code void add(Item item)} — додає позицію в кінець.</li>
 *   <li>{@code void remove(String name)} — видаляє ПЕРШУ позицію з такою назвою;
 *       якщо такої немає — нічого не робить (no-op).</li>
 *   <li>{@code long total()} — сума {@code priceKopecks * qty} по всіх позиціях.</li>
 * </ul>
 * Приклад: add(("Хліб", 1500, 2)), add(("Молоко", 2500, 1)) → total() == 5500.
 *
 * <hr>
 * RU: Корзина покупок (ShoppingCart).
 * <p>
 * Вложенный класс {@link Item} описывает позицию корзины: название ({@code name}),
 * цену за единицу в копейках ({@code priceKopecks}) и количество ({@code qty}).
 * Поля {@code Item} приватные и неизменяемые (final), есть конструктор, геттеры,
 * переопределённые {@code toString/equals/hashCode}.
 * <p>
 * Сама корзина хранит товары в приватном массиве {@code items}, который сначала
 * пуст (длина 0) и растёт с помощью приватного помощника {@code cloneAndExtend}.
 * Массив НЕ final, так как меняется при добавлении/удалении.
 * <p>
 * Методы:
 * <ul>
 *   <li>{@code void add(Item item)} — добавляет позицию в конец.</li>
 *   <li>{@code void remove(String name)} — удаляет ПЕРВУЮ позицию с таким именем;
 *       если такой нет — ничего не делает (no-op).</li>
 *   <li>{@code long total()} — сумма {@code priceKopecks * qty} по всем позициям.</li>
 * </ul>
 * Пример: add(("Хлеб", 1500, 2)), add(("Молоко", 2500, 1)) → total() == 5500.
 */
public class Task41 {

    /**
     * UA: Позиція кошика: назва, ціна за одиницю (копійки), кількість.
     * Поля приватні та незмінні (final).
     * <p>
     * RU: Позиция корзины: название, цена за единицу (копейки), количество.
     * Поля приватные и неизменяемые (final).
     */
    public static class Item {
        private final String name;
        private final long priceKopecks;
        private final int qty;

        /**
         * UA: Створює позицію кошика.
         * RU: Создаёт позицию корзины.
         *
         * @param name         UA: назва товару / RU: название товара
         * @param priceKopecks UA: ціна за одиницю в копійках / RU: цена за единицу в копейках
         * @param qty          UA: кількість / RU: количество
         */
        public Item(String name, long priceKopecks, int qty) {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: назва товару. RU: название товара. */
        public String getName() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: ціна за одиницю в копійках. RU: цена за единицу в копейках. */
        public long getPriceKopecks() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: кількість. RU: количество. */
        public int getQty() {
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

    private Item[] items;

    /**
     * UA: Створює порожній кошик (items довжиною 0).
     * RU: Создаёт пустую корзину (items длиной 0).
     */
    public Task41() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Приватний помічник: повертає копію масиву, збільшену на один елемент.
     * RU: Приватный помощник: возвращает копию массива, увеличенную на один элемент.
     */
    private Item[] cloneAndExtend(Item[] source) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Додає позицію в кінець кошика.
     * RU: Добавляет позицию в конец корзины.
     */
    public void add(Item item) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Видаляє першу позицію з такою назвою; якщо немає — no-op.
     * RU: Удаляет первую позицию с таким именем; если нет — no-op.
     */
    public void remove(String name) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сума priceKopecks * qty по всіх позиціях.
     * RU: Сумма priceKopecks * qty по всем позициям.
     */
    public long total() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає КОПІЮ масиву позицій.
     * RU: Возвращает КОПИЮ массива позиций.
     */
    public Item[] getItems() {
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
