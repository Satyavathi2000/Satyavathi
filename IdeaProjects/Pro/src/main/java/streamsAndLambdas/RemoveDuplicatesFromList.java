package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);

        // Remove duplicate elements using streams
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original List: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);
    }

}