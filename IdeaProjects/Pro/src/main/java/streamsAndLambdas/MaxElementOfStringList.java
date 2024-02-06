package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElementOfStringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        // Find the maximum element based on natural sorting order
        Optional<String> maxElement = strings.stream()
                .max(String::compareTo);

        // Print the result
        System.out.println("Maximum element: " + maxElement.get());
    }

    public static Optional<String> findMaxElement(List<String> strings) {
        return Optional.empty();
    }
}