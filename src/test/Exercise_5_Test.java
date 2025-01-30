package test;
import main.Exercise_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_5_Test {

    @Test
    void returnsZeroForEmptyArray() {
        assertEquals(0, Exercise_5.lenOfLongSubarr(new int[]{}, 8));
    }

    @Test
    void returnsLengthForExactSum() {
        assertEquals(4, Exercise_5.lenOfLongSubarr(new int[]{6, 2, 2, 3, 4, 1}, 8));
    }

    @Test
    void returnsZeroForNoSubarrayWithSum() {
        assertEquals(0, Exercise_5.lenOfLongSubarr(new int[]{1, 2, 3, 4, 5}, 20));
    }

    @Test
    void returnsLengthForSingleElementEqualToK() {
        assertEquals(1, Exercise_5.lenOfLongSubarr(new int[]{8}, 8));
    }

    @Test
    void returnsLengthForSubarrayAtEnd() {
        assertEquals(4, Exercise_5.lenOfLongSubarr(new int[]{1, 2, 3, 4, 5}, 12));
    }

    @Test
    void returnsLengthForSubarrayAtStart() {
        assertEquals(3, Exercise_5.lenOfLongSubarr(new int[]{8, 2, 3, 4, 5}, 10));
    }

    @Test
    void returnsLengthForSubarrayInMiddle() {
        assertEquals(3, Exercise_5.lenOfLongSubarr(new int[]{1, 2, 3, 4, 5}, 9));
    }

    @Test
    void returnsLengthForMultipleSubarrays() {
        assertEquals(5, Exercise_5.lenOfLongSubarr(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 15));
    }

    @Test
    void returnsLengthForNegativeNumbers() {
        assertEquals(6, Exercise_5.lenOfLongSubarr(new int[]{-1, -2, 3, 4, -5, 6, 7, 8}, 8));
    }

    @Test
    void returnsLengthForMixedPositiveAndNegativeNumbers() {
        assertEquals(8, Exercise_5.lenOfLongSubarr(new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5}, 3));
    }

    @Test
    void returnsLengthForSubarrayWithZeroSum() {
        assertEquals(6, Exercise_5.lenOfLongSubarr(new int[]{1, 2, -3, 3, -2, 2, -1}, 0));
    }
}