package arraylist;

import java.util.ArrayList;

public class Traverse {
    public static void main(String[] args) {
            // Use the List interface instead of ArrayList
           ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Red");
            stringList.add("Blue");
            stringList.add("Orange");
            stringList.add("Green");

            // Traverse using enhanced for loop
            System.out.println("Traversing using enhanced for loop:");
            for (String element : stringList) {
                System.out.println(element);
            }
        }

    public void traverseWithForLoop() {
    }

    public void traverseWithEnhancedForLoop() {
    }
}
