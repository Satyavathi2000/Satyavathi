package arraylist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TraverseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testArrayListTraversal() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Create an instance of the class to test
        Traverse arrayListTraversal = new Traverse();

        // Test traversing using for loop
        arrayListTraversal.traverseWithForLoop();
        assertEquals("Apple" + System.lineSeparator() +
                "Banana" + System.lineSeparator() +
                "Orange" + System.lineSeparator() +
                "Grapes" + System.lineSeparator(), outContent.toString());

        // Reset the output content
        outContent.reset();

        // Test traversing using enhanced for loop
        arrayListTraversal.traverseWithEnhancedForLoop();
        assertEquals("Apple" + System.lineSeparator() +
                "Banana" + System.lineSeparator() +
                "Orange" + System.lineSeparator() +
                "Grapes" + System.lineSeparator(), outContent.toString());
    }
}