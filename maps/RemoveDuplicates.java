package maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove duplicates
        String resultString = removeDuplicates(inputString);

        // Output the result
        System.out.println("String after removing duplicates: " + resultString);

        scanner.close();
    }

    private static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain order while removing duplicates
        Set<Character> charSet = new LinkedHashSet<>();

        // Add characters to the set, duplicates will be ignored
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}