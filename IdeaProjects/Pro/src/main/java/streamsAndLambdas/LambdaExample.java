package streamsAndLambdas;

public class LambdaExample {
public static void main(String[] args) {
    // Implementation of addition using lambda expression
    MathOperation addition = Integer::sum;

    // Example usage
    int result = addition.operate(5, 3);
    System.out.println("Result of addition: " + result);
}
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

}
