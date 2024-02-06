package practicePrograms;

public class CaseConverter {

    public static void main(String[] args) {
        // Example string
        String inputString = "Hello World!";

        // Convert the case of characters and print the result
        String convertedString = convertCase(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Converted String: " + convertedString);
    }

    public static String convertCase(String input) {
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is upper-case
            if (Character.isUpperCase(c)) {
                // Convert to lower-case and append to the result
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                // Convert to upper-case and append to the result
                result.append(Character.toUpperCase(c));
            } else {
                // Leave non-alphabetic characters unchanged
                result.append(c);
            }
        }

        return result.toString();
    }
}