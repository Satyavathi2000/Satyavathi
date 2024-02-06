package streamsAndLambdas;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndDoubleNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)   // Filter out even numbers
                .map(n -> n * 2)            // Double each remaining number
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Filtered and Doubled Numbers: " + result);
    }

    public static List<Integer> filterAndDoubleNumbers(List<Integer> numbers) {
        return numbers;
    }
}
