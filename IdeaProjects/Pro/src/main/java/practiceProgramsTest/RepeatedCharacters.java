package practiceProgramsTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printRepeatedCharacters(input);
    }

    private static void printRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Displaying characters that are repeated
        System.out.println("Repeated characters are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }
}


