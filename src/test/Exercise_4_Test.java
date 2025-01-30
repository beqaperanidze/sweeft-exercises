package test;

import main.Exercise_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise_4_Test {

    @Test
    void returnsEmptyArrayForNoCommonElements() {
        assertArrayEquals(new int[]{}, Exercise_4.findIntersection(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void returnsIntersectionForCommonElements() {
        assertArrayEquals(new int[]{3, 4, 5}, Exercise_4.findIntersection(new int[]{1, 2, 3, 3, 4, 5}, new int[]{3, 4, 4, 5, 6, 7}));
    }

    @Test
    void returnsEmptyArrayForEmptyFirstArray() {
        assertArrayEquals(new int[]{}, Exercise_4.findIntersection(new int[]{}, new int[]{1, 2, 3}));
    }

    @Test
    void returnsEmptyArrayForEmptySecondArray() {
        assertArrayEquals(new int[]{}, Exercise_4.findIntersection(new int[]{1, 2, 3}, new int[]{}));
    }

    @Test
    void returnsEmptyArrayForBothEmptyArrays() {
        assertArrayEquals(new int[]{}, Exercise_4.findIntersection(new int[]{}, new int[]{}));
    }

    @Test
    void returnsIntersectionForIdenticalArrays() {
        assertArrayEquals(new int[]{1, 2, 3}, Exercise_4.findIntersection(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }

    @Test
    void returnsIntersectionForArraysWithDuplicates() {
        assertArrayEquals(new int[]{2, 3}, Exercise_4.findIntersection(new int[]{1, 2, 2, 3, 3}, new int[]{2, 2, 3, 3, 4}));
    }
}