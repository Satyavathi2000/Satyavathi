package streamsAndLambdasTest;

import org.junit.Test;
import streamsAndLambdas.CapitalizeAndSortStrings;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CapitalizeAndSortStringsTest {

    @Test
    public void testCapitalizeAndSortStrings() {
        String[] inputStrings = {"apple", "banana", "orange", "grape", ""};

        String[] expectedOutput = {"Apple", "Banana", "Grape", "Orange"};

        String[] result = CapitalizeAndSortStrings.capitalizeAndSortStrings(inputStrings);

        assertArrayEquals(expectedOutput, result);
    }
}
