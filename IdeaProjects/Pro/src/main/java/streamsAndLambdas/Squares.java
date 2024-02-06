package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;

public class Squares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);

        int sumOfSquares = numbers.stream()
                .filter(n -> n > 0)  // Filter out negative integers
                .mapToInt(n -> n * n)  // Square each positive integer
                .sum();  // Sum the squares

        System.out.println("Sum of squares of positive integers: " + sumOfSquares);
    }

    public static int calculateSumOfSquares(List<Integer> numbers) {
        return 0;
    }
}
