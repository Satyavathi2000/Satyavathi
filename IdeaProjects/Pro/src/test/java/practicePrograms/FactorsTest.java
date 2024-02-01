package practicePrograms;


import java.util.Scanner;

public class FactorsTest {

    public static void main(String[] args) {
        normalExecution();
        runTests();  // Comment this out if you want to run the program normally
        // normalExecution();  // Uncomment this line to run the program normally
    }

    private static void normalExecution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static void runTests() {
        testFactorial(5, 120);
        testFactorial(0, 1);
        testFactorial(-3, -1);  // Using -1 to indicate an error for negative numbers
        testFactorial(10, 3628800);
    }

    private static void testFactorial(int input, long expected) {
        try {
            long result = calculateFactorial(input);
            if (result == expected) {
                System.out.println("Test passed for input: " + input);
            } else {
                System.out.println("Test failed for input: " + input + ". Expected: " + expected + ", but got: " + result);
            }
        } catch (IllegalArgumentException e) {
            if (expected == -1) {
                System.out.println("Test passed for input: " + input + " (expected error)");
            } else {
                System.out.println("Test failed for input: " + input + ". Unexpected error: " + e.getMessage());
            }
        }
    }
}
