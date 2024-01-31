package maps;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class HashSetExampleTest {

    @Test
    public void testHashSetContainsAllElements() {
        // Arrange
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Cherry");
        stringHashSet.add("Date");
        stringHashSet.add("Orange");
        stringHashSet.add("Grapes");
        stringHashSet.add("Kiwi");
        stringHashSet.add("Mango");
        stringHashSet.add("Pineapple");
        stringHashSet.add("Strawberry");

        // Assert
        assertTrue(stringHashSet.contains("Apple"));
        assertTrue(stringHashSet.contains("Banana"));
        assertTrue(stringHashSet.contains("Cherry"));
        assertTrue(stringHashSet.contains("Date"));
        assertTrue(stringHashSet.contains("Orange"));
        assertTrue(stringHashSet.contains("Grapes"));
        assertTrue(stringHashSet.contains("Kiwi"));
        assertTrue(stringHashSet.contains("Mango"));
        assertTrue(stringHashSet.contains("Pineapple"));
        assertTrue(stringHashSet.contains("Strawberry"));
    }
}
