package practiceProgramsTest;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArraySumTest{

    public static List<String> filterStringsStartingWithA(List<String> inputList) {
        // Lambda expression as a predicate to filter strings starting with "A"
        Predicate<String> startsWithAPredicate = s -> s.startsWith("A");

        // Use stream and filter to apply the predicate
        return inputList.stream()
                .filter(startsWithAPredicate.negate())  // Filter out strings starting with "A"
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example usage
        List<String> inputList = List.of("Apple", "Banana", "Orange", "Grape", "Avocado", "Kiwi");

        List<String> filteredList = filterStringsStartingWithA(inputList);

        // Print the filtered list
        System.out.println("Filtered List: " + filteredList);
    }
}
