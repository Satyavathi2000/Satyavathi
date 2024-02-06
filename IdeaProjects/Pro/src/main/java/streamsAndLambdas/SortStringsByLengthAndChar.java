package streamsAndLambdas;


import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLengthAndChar {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "orange", "grape"};

        Arrays.sort(strings, Comparator
                .<String, Integer>comparing(String::length)
                .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1))
                        .reversed())
        );

        // Print the sorted array
        Arrays.stream(strings).forEach(System.out::println);
    }

    public static void sortStringsByLengthAndLastChar(String[] strings) {
    }
}
