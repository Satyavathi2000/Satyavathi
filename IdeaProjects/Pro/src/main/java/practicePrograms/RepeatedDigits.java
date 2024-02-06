package practicePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        findRepeatedDigits(number);
    }

    private static void findRepeatedDigits(long number) {
        String numStr = Long.toString(number);
        Map<Character, Integer> digitCount = new HashMap<>();

        // Counting each digit
        for (char digit : numStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Checking for repeated digits
        boolean hasRepeated = false;
        System.out.println("Repeated digits:");
        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                hasRepeated = true;
            }
        }

        if (!hasRepeated) {
            System.out.println("None");
        }
    }
}

