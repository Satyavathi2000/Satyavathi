package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSortStrings {

    public static void main(String[] args) {
        // Sample array of strings
        String[] stringsArray = {"apple", "banana", "orange", "grape", "kiwi"};

        // Capitalize the first letter of each string and sort alphabetically
        List<String> result = Arrays.stream(stringsArray)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Capitalized and Sorted Strings:");
        result.forEach(System.out::println);
    }

    public static String[] capitalizeAndSortStrings(String[] inputStrings) {
        return inputStrings;
    }
}
