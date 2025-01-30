package test;

import main.Exercise_6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Exercise_6_Test {

    @Test
    void returnsTrueForValidSequence() {
        assertTrue(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{1, 6, -1, 10}));
    }

    @Test
    void returnsFalseForInvalidSequence() {
        assertFalse(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{1, 6, 10, -1}));
    }

    @Test
    void returnsTrueForEmptySequence() {
        assertTrue(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{}));
    }

    @Test
    void returnsFalseForEmptyArray() {
        assertFalse(Exercise_6.isValidSequence(new int[]{}, new int[]{1, 6, -1, 10}));
    }

    @Test
    void returnsTrueForSingleElementSequence() {
        assertTrue(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{22}));
    }

    @Test
    void returnsFalseForSingleElementSequenceNotInArray() {
        assertFalse(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{99}));
    }

    @Test
    void returnsTrueForSequenceAtStart() {
        assertTrue(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{5, 1, 22}));
    }

    @Test
    void returnsTrueForSequenceAtEnd() {
        assertTrue(Exercise_6.isValidSequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{6, -1, 8, 10}));
    }

    @Test
    void returnsFalseForSequenceLongerThanArray() {
        assertFalse(Exercise_6.isValidSequence(new int[]{5, 1, 22}, new int[]{5, 1, 22, 25}));
    }
}