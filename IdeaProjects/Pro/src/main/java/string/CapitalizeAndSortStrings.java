package string;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        // Example array of strings
        String[] strings = {"banana", "apple", "orange", "mango"};

        // Capitalize first letter and sort
        String[] capitalizedAndSortedStrings = capitalizeAndSort(strings);

        // Print the result
        for (String str : capitalizedAndSortedStrings) {
            System.out.println(str);
        }
    }

    private static String[] capitalizeAndSort(String[] strings) {
        String[] result = new String[strings.length];

        // Capitalize the first letter of each string
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
        }

        // Sort the strings in alphabetical order
        Arrays.sort(result);

        return result;
    }
}
