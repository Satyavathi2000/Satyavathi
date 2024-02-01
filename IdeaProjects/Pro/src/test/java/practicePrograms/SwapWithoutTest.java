package practicePrograms;


public class SwapWithoutTest {

    public static void main(String[] args) {
        runTests();
    }

    private static void swap(int[] numbers) {
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
    }

    private static void runTests() {
        testSwap(new int[]{10, 20}, new int[]{20, 10});
        testSwap(new int[]{-15, 25}, new int[]{25, -15});
        testSwap(new int[]{-30, -40}, new int[]{-40, -30});
        testSwap(new int[]{0, 50}, new int[]{50, 0});
        testSwap(new int[]{100, 100}, new int[]{100, 100});
    }

    private static void testSwap(int[] input, int[] expected) {
        swap(input);
        if (input[0] == expected[0] && input[1] == expected[1]) {
            System.out.println("Test passed for input: [" + input[0] + ", " + input[1] + "]");
        } else {
            System.out.println("Test failed for input: [" + input[0] + ", " + input[1] + "]");
        }
    }
}
