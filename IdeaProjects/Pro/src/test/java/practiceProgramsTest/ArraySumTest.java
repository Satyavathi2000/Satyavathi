package practiceProgramsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArraySumTest {

    @Test
    public void testCalculateSumWithPositiveNumbers() {
        int[] numbers = {10, 20, 30, 40, 50};
        int expectedSum = 150;
        assertEquals(expectedSum, ArraySumTest.calculateSum(numbers));
    }

    private static int calculateSum(int[] numbers) {
        return 0;
    }

    @Test
    public void testCalculateSumWithNegativeNumbers() {
        int[] numbers = {-10, -20, -30, -40, -50};
        int expectedSum = -150;
        assertEquals(expectedSum, ArraySumTest.calculateSum(numbers));
    }

    @Test
    public void testCalculateSumWithMixedNumbers() {
        int[] numbers = {-10, 20, -30, 40, -50};
        int expectedSum = -30;
        assertEquals(expectedSum, ArraySumTest.calculateSum(numbers));
    }

    @Test
    public void testCalculateSumWithEmptyArray() {
        int[] numbers = {};
        int expectedSum = 0;
        assertEquals(expectedSum, ArraySumTest.calculateSum(numbers));
    }

    @Test
    public void testCalculateSumWithSingleElement() {
        int[] numbers = {42};
        int expectedSum = 42;
        assertEquals(expectedSum, ArraySumTest.calculateSum(numbers));
    }
}
