package maps;

import java.util.HashSet;


public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();

        // Add 10 strings to the HashSet
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

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        for (String fruit : stringHashSet) {
            System.out.println(fruit);
        }

        // Iterate using for loop
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringHashSet.toArray();
        for (Object o : stringArray) {
            String fruit = (String) o;
            System.out.println(fruit);
        }

        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : stringHashSet) {
            System.out.println(fruit);
        }
    }
}