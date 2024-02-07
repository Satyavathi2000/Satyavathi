package exceptionTest;

public class StringToIntegerConverter {

    public static void main(String[] args) {
        convertAndPrint("23");
        convertAndPrint("45.67");
        convertAndPrint("test");
        convertAndPrint("123f");
    }

    public static void convertAndPrint(String input) {
        try {
            int result = convertStringToInt(input);
            System.out.println("Converted value for \"" + input + "\": " + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception for \"" + input + "\": " + e.getMessage());
        }
    }

    public static int convertStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
