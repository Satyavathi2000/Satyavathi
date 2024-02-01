package practicePrograms;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindromeWithString() {
        // Arrange
        String palindromeString = "level";

        // Act
        boolean result = Palindrome.isPalindrome(palindromeString);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsNotPalindromeWithString() {
        // Arrange
        String nonPalindromeString = "hello";

        // Act
        boolean result = Palindrome.isPalindrome(nonPalindromeString);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithNumber() {
        // Arrange
        int palindromeNumber = 1221;

        // Act
        boolean result = Palindrome.isPalindrome(palindromeNumber);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsNotPalindromeWithNumber() {
        // Arrange
        int nonPalindromeNumber = 12345;

        // Act
        boolean result = Palindrome.isPalindrome(nonPalindromeNumber);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithMixedCaseString() {
        // Arrange
        String mixedCasePalindromeString = "Madam";

        // Act
        boolean result = Palindrome.isPalindrome(mixedCasePalindromeString);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        // Arrange
        String emptyString = "";

        // Act
        boolean result = Palindrome.isPalindrome(emptyString);

        // Assert
        assertTrue(result);


    }
}