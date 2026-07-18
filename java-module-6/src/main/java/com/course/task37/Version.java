package com.course.task37;

import java.util.Objects;

/**
 * Семантическая версия (major.minor.patch).
 * Естественный порядок: по major, затем minor, затем patch (по возрастанию).
 */
public class Version implements Comparable<Version> {

    private int major;
    private int minor;
    private int patch;

    public Version(int major, int minor, int patch) {
        // TODO: реализуй
        this.major = major;
        this.minor = minor;
        this.patch = patch;
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

    @Override
    public int compareTo(Version other) {
        // TODO: реализуй
        if (other == null) {
            return 1;
        }

        int majorCompare = Integer.compare(this.major, other.major);
        if (majorCompare != 0) {
            return majorCompare;
        }

        int minorCompare = Integer.compare(this.minor, other.minor);
        if (minorCompare != 0) {
            return minorCompare;
        }
        return Integer.compare(this.patch, other.patch);
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Version version)) return false;
        return major == version.major
                && minor == version.minor
                && patch == version.patch;
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
