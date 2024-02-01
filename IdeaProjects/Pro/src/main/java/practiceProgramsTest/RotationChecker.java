package practiceProgramsTest;

public class RotationChecker {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isRotation("abcde", "deabc")); // true
        System.out.println(isRotation("hello", "lohel")); // true
        System.out.println(isRotation("abc", "bca"));    // true
        System.out.println(isRotation("abc", "cba"));    // false

    }
    public static boolean isRotation(String str1, String str2) {
        // Check if both strings are not null and have the same length
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedString = str1 + str1;

        // Check if the second string is a substring of the concatenated string
        return concatenatedString.contains(str2);
    }
}