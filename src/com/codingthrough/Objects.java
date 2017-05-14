package com.codingthrough;

import java.util.Arrays;

/**
 * This class consists of {@code static} utility methods for operating
 * on objects.
 */
public class Objects {
    /**
     * This class should not be instantiated.
     */
    private Objects() {
    }

    /**
     * Returns {@code true} if the provided reference is {@code null}, otherwise
     * returns {@code false}.
     *
     * @param obj the object reference to check for nullity
     * @return {@code true} if the provided reference is {@code null}, otherwise
     * {@code false}
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * Returns {@code true} if the provided reference is not {@code null},
     * otherwise returns {@code false}.
     *
     * @param obj the object reference to check for nullity
     * @return {@code true} if the provided reference is not {@code null},
     * otherwise {@code false}
     */
    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    /**
     * Returns {@code true} if the arguments are equal to each other
     * and {@code false} otherwise.
     * Consequently, if both arguments are {@code null}, {@code true}
     * is returned and if exactly one argument is {@code null}, {@code
     * false} is returned.  Otherwise, equality is determined by using
     * the {@link Object#equals equals} method of the first
     * argument.
     *
     * @param a the object reference to check for equality
     * @param b the object reference to check for equality
     * @return {@code true} if the provided references are equal to each other,
     * otherwise {@code false}
     */
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    /**
     * Returns a generated hash code for a sequence of input values. The hash
     * code is generated as if all the input values were placed into an
     * array, and that array were hashed by calling {@link
     * Arrays#hashCode(Object[])}.
     *
     * @param values the values to be hashed
     * @return a hash value of the sequence of input values
     */
    public static int hashCode(Object... values) {
        return Arrays.hashCode(values);
    }
}
