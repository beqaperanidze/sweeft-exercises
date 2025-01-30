package test;

import main.Exercise_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise_1_Test {

    @Test
    void evaluateExpression_withValidExpression_returnsCorrectResult() {
        assertEquals(22, Exercise_1.evaluateExpression("5+20-8+5"));
    }

    @Test
    void evaluateExpression_withSingleDigit_returnsCorrectResult() {
        assertEquals(5, Exercise_1.evaluateExpression("5"));
    }

    @Test
    void evaluateExpression_withNegativeResult_returnsCorrectResult() {
        assertEquals(-3, Exercise_1.evaluateExpression("5-8"));
    }

    @Test
    void evaluateExpression_withLeadingZeros_returnsCorrectResult() {
        assertEquals(5, Exercise_1.evaluateExpression("05"));
    }

    @Test
    void evaluateExpression_withMultipleDigits_returnsCorrectResult() {
        assertEquals(123, Exercise_1.evaluateExpression("100+20+3"));
    }

    @Test
    void evaluateExpression_withInvalidCharacters_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> Exercise_1.evaluateExpression("5+2a-8"));
    }

    @Test
    void evaluateExpression_withEmptyString_returnsZero() {
        assertEquals(0, Exercise_1.evaluateExpression(""));
    }
}