package com.codingthru.search;

/**
 * Implementation of the sequential search algorithm.
 */
public class LinearSearch {
    /**
     * Iterative version of the linear search algorithm.
     *
     * @param a initial array to analyze
     * @param x searching item
     * @return index of the element if found, otherwise, -1
     */
    public static int search(int a[], int x) {
        return search(a, 0, a.length - 1, x);
    }

    /**
     * Iterative version of the linear search algorithm which search
     * the particular element only in the passed range.
     *
     * @param a     initial array
     * @param start the first inclusive index to start search
     * @param end   the last inclusive index to stop search
     * @param x     searching item
     * @return index of the element if found, otherwise, -1
     */
    public static int search(int a[], int start, int end, int x) {
        for (int i = start; i <= end; i++) {
            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Recursive version of the linear search algorithm.
     *
     * @param a initial array to analyze
     * @param x searching item
     * @return index of the element if found, otherwise, -1
     */
    public static int searchRecursive(int a[], int x) {
        return searchRecursive(a, 0, x);
    }

    /**
     * Recursive version of the linear search algorithm which search
     * the particular element starting from the passed index.
     *
     * @param a     initial array
     * @param start the first inclusive index to start search
     * @param x     searching item
     * @return index of the element if found, otherwise, -1
     */
    public static int searchRecursive(int a[], int start, int x) {
        if (start >= a.length) {
            return -1;
        }

        if (a[start] == x) {
            return start;
        }

        return searchRecursive(a, ++start, x);
    }

    /**
     * Recursive version of the linear search algorithm which search
     * the particular element only in the passed range.
     *
     * @param a     initial array
     * @param start the first inclusive index to start search
     * @param end   the last inclusive index to stop search
     * @param x     searching item
     * @return index of the element if found, otherwise, -1
     */
    public static int searchRecursive(int a[], int start, int end, int x) {
        if (start >= a.length || start > end) {
            return -1;
        }

        if (a[start] == x) {
            return start;
        }

        return searchRecursive(a, ++start, end, x);
    }

    public static void main(String[] args) {

    }
}
