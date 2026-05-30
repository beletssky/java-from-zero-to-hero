package com.course.tasks;

/**
 * UA: Гравець на координатній сітці (Player).
 * <p>
 * Вкладений enum {@link Direction}: NORTH, SOUTH, EAST, WEST.
 * Поля {@code x}, {@code y}, {@code facing} — усі змінювані (сетери setX, setY, setFacing).
 * Метод {@link #move(int)} рухає гравця у напрямку {@code facing} за домовленістю (switch):
 * <ul>
 *   <li>NORTH → y += steps</li>
 *   <li>SOUTH → y -= steps</li>
 *   <li>EAST  → x += steps</li>
 *   <li>WEST  → x -= steps</li>
 * </ul>
 * Приклад: гравець (0,0,NORTH).move(3) дає (0,3,NORTH).
 * <p>
 * RU: Игрок на координатной сетке (Player).
 * <p>
 * Вложенный enum {@link Direction}: NORTH, SOUTH, EAST, WEST.
 * Поля {@code x}, {@code y}, {@code facing} — все изменяемые (сеттеры setX, setY, setFacing).
 * Метод {@link #move(int)} двигает игрока в направлении {@code facing} по соглашению (switch):
 * <ul>
 *   <li>NORTH → y += steps</li>
 *   <li>SOUTH → y -= steps</li>
 *   <li>EAST  → x += steps</li>
 *   <li>WEST  → x -= steps</li>
 * </ul>
 * Пример: игрок (0,0,NORTH).move(3) даёт (0,3,NORTH).
 */
public class Task33 {

    /**
     * UA: Напрямки: NORTH, SOUTH, EAST, WEST.
     * RU: Направления: NORTH, SOUTH, EAST, WEST.
     */
    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    /**
     * UA: Координата x (змінюване поле).
     * RU: Координата x (изменяемое поле).
     */
    private int x;

    /**
     * UA: Координата y (змінюване поле).
     * RU: Координата y (изменяемое поле).
     */
    private int y;

    /**
     * UA: Напрямок погляду (змінюване поле).
     * RU: Направление взгляда (изменяемое поле).
     */
    private Direction facing;

    /**
     * UA: Конструктор — задає x, y та напрямок.
     * RU: Конструктор — задаёт x, y и направление.
     */
    public Task33(int x, int y, Direction facing) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер x.
     * RU: Геттер x.
     */
    public int getX() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер y.
     * RU: Геттер y.
     */
    public int getY() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер напрямку.
     * RU: Геттер направления.
     */
    public Direction getFacing() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер x (змінюване поле).
     * RU: Сеттер x (изменяемое поле).
     */
    public void setX(int x) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер y (змінюване поле).
     * RU: Сеттер y (изменяемое поле).
     */
    public void setY(int y) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер напрямку (змінюване поле).
     * RU: Сеттер направления (изменяемое поле).
     */
    public void setFacing(Direction facing) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Рух у напрямку facing за домовленістю (switch): NORTH y+=, SOUTH y-=, EAST x+=, WEST x-=.
     * RU: Движение в направлении facing по соглашению (switch): NORTH y+=, SOUTH y-=, EAST x+=, WEST x-=.
     */
    public void move(int steps) {
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
