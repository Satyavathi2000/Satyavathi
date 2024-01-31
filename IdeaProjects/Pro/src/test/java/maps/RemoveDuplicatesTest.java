/*package maps;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    private final AtomicReference<RemoveDuplicates> removeDuplicates = new AtomicReference<RemoveDuplicates>();

    {
        removeDuplicates.set(new RemoveDuplicates());
    }

    public RemoveDuplicatesTest() {
    }

    @Test
    public void testRemoveDuplicates() {
        // Test case 1: No duplicates
        String result1 = removeDuplicates.get().removeDuplicates("abcdef");
        assertEquals("abcdef", result1);

        // Test case 2: Some duplicates
        String result2 = removeDuplicates.get().removeDuplicates("programming");
        assertEquals("progamin", result2);

        // Test case 3: All characters are duplicates
        String result3 = removeDuplicates.get().removeDuplicates("aaaaaa");
        assertEquals("a", result3);

        // Test case 4: Empty string
        String result4 = removeDuplicates.get().removeDuplicates("");
        assertEquals("", result4);

        // Test case 5: Single character
        String result5 = removeDuplicates.get().removeDuplicates("x");
        assertEquals("x", result5);

        // Test case 6: String with spaces
        String result6 = removeDuplicates.get().removeDuplicates("hello world");
        assertEquals("helo wrd", result6); // Note: "hello world" contains duplicate 'l' and 'o'
    }
}*/
