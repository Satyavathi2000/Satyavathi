package practiceProgramsTest;

public class SwapWithout {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping values without using a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
