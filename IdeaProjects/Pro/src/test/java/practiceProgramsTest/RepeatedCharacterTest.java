package practiceProgramsTest;

import java.util.Map;

class RepeatedCharactersTest {

    public static void main(String[] args) {
        testRepeatedCharacters("hello");
        testRepeatedCharacters("world");
        testRepeatedCharacters("programming");
        testRepeatedCharacters("");
        testRepeatedCharacters("unique");
        testRepeatedCharacters("abc");
    }

    private static Map<Character, Integer> testRepeatedCharacters(String testString) {
        System.out.println("Testing with input: \"" + testString + "\"");
        Map<Character, Integer> result = RepeatedCharactersTest.testRepeatedCharacters(testString);

        boolean hasRepeats = false;
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Repeated character: " + entry.getKey() + " - Count: " + entry.getValue());
                hasRepeats = true;
            }
        }

        if (!hasRepeats) {
            System.out.println("No repeated characters.");
        }

        System.out.println();
        return result;
    }
}
