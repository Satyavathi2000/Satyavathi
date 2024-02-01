package practiceProgramsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListTest {
    // Method to reverse an ArrayList and return it
    public static List<Integer> reverseList(List<Integer> inputList) {
        List<Integer> tempList = new ArrayList<>(inputList); // Creating a copy to avoid modifying the original list
        Collections.reverse(tempList);
        return tempList;
    }

    public static void main(String[] args) {
        // Creating an ArrayList and adding elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Reversing the ArrayList
        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Reversed ArrayList: " + reversedNumbers);
    }
}
