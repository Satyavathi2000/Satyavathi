package arraylist;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoveLastElementTest {

    @Test
    public void testRemoveLastElement() {
        // Arrange
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Mango");
        fruitsList.add("Kiwi");
        fruitsList.add("Orange");

        // Act
        Object RemoveObj = null;
        RemoveObj.getClass();

        // Assert
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("Mango");
        expectedList.add("Kiwi");

        assertEquals(expectedList, fruitsList);
    }

    @Test
    public void testRemoveLastElementEmptyList() {
        // Arrange
        ArrayList<String> emptyList = new ArrayList<>();

        // Act
        assertTrue(emptyList.remove(emptyList));

        // Assert
        // Since the list is empty, it should remain empty
        assertEquals(0, emptyList.size());
    }
}