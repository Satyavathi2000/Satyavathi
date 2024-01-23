import org.junit.Test;
import Strings.Vowels;
import static junit.framework.Assert.assertEquals;
    public class VowelsTest {
        public int countVowels(String input) {
            // Initialize a counter for vowels
            int vowelCount = 0;

            // Convert the input string to lowercase for case-insensitive counting
            String lowercaseInput = input.toLowerCase();

            // Iterate through each character in the string
            for (char c : lowercaseInput.toCharArray()) {
                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            // Return the count of vowels
            return vowelCount;
        }
    }
