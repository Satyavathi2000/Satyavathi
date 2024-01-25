package Strings;

import org.junit.Test;
import Strings.Anagram;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramTest {

    @Test
    public void testAreAnagrams() {
        // Arrange
        String str1 = "Below";
        String str2 = "Elbow";

        // Act & Assert
        assertTrue(Anagram.areAnagrams(str1, str2));
    }

    @Test
    public void testAreNotAnagrams() {
        // Arrange
        String str1 = "hello";
        String str2 = "world";

        // Act & Assert
        assertFalse(Anagram.areAnagrams(str1, str2));
    }
}
