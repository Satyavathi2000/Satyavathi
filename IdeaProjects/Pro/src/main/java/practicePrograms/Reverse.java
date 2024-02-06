package practicePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");

        // Display original ArrayList
        System.out.println("Original ArrayList: " + originalList);

        // Reverse the ArrayList
        reverseArrayList(originalList);

        // Display reversed ArrayList
        System.out.println("Reversed ArrayList: " + originalList);
    }

    public static void reverseArrayList(ArrayList<String> list) {
        // Use Collections.reverse() to reverse the ArrayList
        Collections.reverse(list);
    }
}