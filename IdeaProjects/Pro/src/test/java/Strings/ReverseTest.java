package Strings;

import java.lang.String;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseTest {
    public void testReverseEachWord() {
        // Arrange
        String inputSentence = "Java J2EE Reverse Me";
        String expectedOutput = "avaJ E2JJ Reverse eM";

        // Act
        String outputSentence = null;

        // Assert
        assertEquals(expectedOutput, outputSentence);
    }

}