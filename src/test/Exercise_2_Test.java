package test;

import main.Exercise_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

public class Exercise_2_Test {

    @Test
    void returnsZeroForEmptyList() {
        assertEquals(0, Exercise_2.numberOfHappyStrings(Collections.emptyList()));
    }

    @Test
    void returnsZeroForListWithUnhappyStrings() {
        assertEquals(0, Exercise_2.numberOfHappyStrings(Arrays.asList("aa", "bb", "cc")));
    }

    @Test
    void returnsCountForListWithHappyStrings() {
        assertEquals(3, Exercise_2.numberOfHappyStrings(Arrays.asList("abc", "bac", "cab")));
    }

    @Test
    void returnsCountForMixedList() {
        assertEquals(2, Exercise_2.numberOfHappyStrings(Arrays.asList("abc", "aabb", "bca")));
    }

    @Test
    void returnsOneForSingleHappyString() {
        assertEquals(1, Exercise_2.numberOfHappyStrings(Collections.singletonList("abc")));
    }

    @Test
    void returnsZeroForSingleUnhappyString() {
        assertEquals(0, Exercise_2.numberOfHappyStrings(Collections.singletonList("aabb")));
    }
}