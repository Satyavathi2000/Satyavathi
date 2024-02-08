package streamsAndLambdasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.FilterAndDoubleNumbers;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterAndDoubleNumbersTest {

    @Test
    public void testFilterAndDoubleNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> expectedOutput = Arrays.asList(2, 6, 10, 14, 18);

        List<Integer> result = FilterAndDoubleNumbers.filterAndDoubleNumbers(numbers);

        // Assert the expected and actual result lists are equal
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void testFilterAndDoubleNumbersWithEmptyList() {
        List<Integer> numbers = List.of();

        List<Integer> expectedOutput = List.of();

        List<Integer> result = FilterAndDoubleNumbers.filterAndDoubleNumbers(numbers);

        // Assert the expected and actual result lists are equal for an empty list
        assertEquals(expectedOutput, result);
    }
}
