package arraylist;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayListToArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Kiwi");

        // Convert ArrayList to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Check if the size of the array matches the size of the ArrayList
        assertEquals(stringList.size(), stringArray.length);

        // Check if the array elements match the ArrayList elements
        assertArrayEquals(stringList.toArray(), stringArray);

        // Check if each element in the array is present in the ArrayList
        for (String element : stringArray) {
            assertTrue(stringList.contains(element));
        }

        // Check if each element in the ArrayList is present in the array
        for (String element : stringList) {
            assertTrue(Arrays.asList(stringArray).contains(element));
        }
    }
}