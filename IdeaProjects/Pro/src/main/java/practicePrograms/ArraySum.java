package practicePrograms;

public class ArraySum {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("Sum of array elements is: " + sum);
    }
}


