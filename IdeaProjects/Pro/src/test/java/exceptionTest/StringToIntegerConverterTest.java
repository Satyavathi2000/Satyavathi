package exceptionTest;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerConverterTest {

    @Test
    public void testConvertStringToInt() {
        assertEquals(23, StringToIntegerConverter.convertStringToInt("23"));
        assertEquals(0, StringToIntegerConverter.convertStringToInt("0"));
        assertEquals(-45, StringToIntegerConverter.convertStringToInt("-45"));
    }

    @Test
    public void testConvertAndPrint() {
        assertEquals("Converted value for \"23\": 23", captureOutput(() -> StringToIntegerConverter.convertAndPrint("23")));
        assertEquals("Exception for \"45.67\": For input string: \"45.67\"", captureOutput(() -> StringToIntegerConverter.convertAndPrint("45.67")));
        assertEquals("Exception for \"test\": For input string: \"test\"", captureOutput(() -> StringToIntegerConverter.convertAndPrint("test")));
        assertEquals("Exception for \"123f\": For input string: \"123f\"", captureOutput(() -> StringToIntegerConverter.convertAndPrint("123f")));
    }

    private String captureOutput(Runnable code) {
        try {
            setOut();
            code.run();
            return System.out.toString().trim();
        } finally {
            setOut();
        }
    }

    private void setOut() {
    }
}
