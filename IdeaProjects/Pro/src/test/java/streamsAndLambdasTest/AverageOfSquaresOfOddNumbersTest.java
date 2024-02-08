package streamsAndLambdasTest;

import streamsAndLambdas.AverageOfSquaresOfOddNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfSquaresOfOddNumbersTest {

    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double expectedAverage = ((1.0 * 1 * 1) + (1.0 * 3 * 3) + (1.0 * 5 * 5) + (1.0 * 7 * 7) + (1.0 * 9 * 9)) / 5.0;

        double actualAverage = AverageOfSquaresOfOddNumbers.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Assert the expected and actual averages are equal
        assertEquals(expectedAverage, actualAverage);
    }
}
