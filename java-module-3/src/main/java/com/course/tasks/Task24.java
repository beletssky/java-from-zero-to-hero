package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює семантичну версію (Version).
 * <ul>
 *   <li>Поля: {@code major}, {@code minor}, {@code patch} — всі {@code int}, незмінні (final), всі >= 0 (інакше {@link IllegalArgumentException}).</li>
 *   <li>Методи: гетери {@link #getMajor()}, {@link #getMinor()}, {@link #getPatch()};
 *       {@link #isNewerThan(Task24)} порівнює спочатку major, потім minor, потім patch.</li>
 *   <li>equals/hashCode: за всіма трьома полями.</li>
 *   <li>toString: повертає "major.minor.patch", напр. "1.2.3".</li>
 *   <li>Приклад: {@code new Task24(1, 2, 3).toString()} -> "1.2.3".</li>
 * </ul>
 * <p>
 * RU: Класс моделирует семантическую версию (Version).
 * <ul>
 *   <li>Поля: {@code major}, {@code minor}, {@code patch} — все {@code int}, неизменяемые (final), все >= 0 (иначе {@link IllegalArgumentException}).</li>
 *   <li>Методы: геттеры {@link #getMajor()}, {@link #getMinor()}, {@link #getPatch()};
 *       {@link #isNewerThan(Task24)} сравнивает сначала major, затем minor, затем patch.</li>
 *   <li>equals/hashCode: по всем трём полям.</li>
 *   <li>toString: возвращает "major.minor.patch", напр. "1.2.3".</li>
 *   <li>Пример: {@code new Task24(1, 2, 3).toString()} -> "1.2.3".</li>
 * </ul>
 */
public class Task24 {

    private final int major;
    private final int minor;
    private final int patch;

    public Task24(int major, int minor, int patch) {
        // TODO: реализуй
        validateNumber(major);
        validateNumber(minor);
        validateNumber(patch);
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    private void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getMajor() {
        // TODO: реализуй
        return major;
    }

    public int getMinor() {
        // TODO: реализуй
        return minor;
    }

    public int getPatch() {
        // TODO: реализуй
        return patch;
    }

    public boolean isNewerThan(Task24 other) {
        // TODO: реализуй
        if (this.major != other.major) {
            return this.major > other.major;
        }
        if (this.minor != other.minor) {
            return this.minor > other.minor;
        }
        return this.patch > other.patch;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task24 task24)) return false;
        return this.major == task24.major
                && this.minor == task24.minor
                && this.patch == task24.patch;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(major, minor, patch);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return major + "." + minor + "." + patch;
    }
}
