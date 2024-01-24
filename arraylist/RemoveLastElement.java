package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveLastElement {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Blue");
        stringList.add("Brown");
        stringList.add("Pink");
        stringList.add("Yellow");

        // Display the LinkedList before removal
        System.out.println("LinkedList before removal: " + stringList);

        // Remove the last object
        if (!stringList.isEmpty()) {
            stringList.removeLast();
            System.out.println("Removed the last object.");
        } else {
            System.out.println("LinkedList is empty. Nothing to remove.");
        }

        // Display the LinkedList after removal
        System.out.println("LinkedList after removal: " + stringList);
    }
}






