package streamsAndLambdas;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        // Group strings by their length using streams
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        // Print the result
        groupedByLength.forEach((length, list) -> System.out.println("Length " + length + ": " + list));
    }

    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        return null;
    }
}
