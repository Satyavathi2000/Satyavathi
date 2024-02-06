package streamsAndLambdas;


import java.util.Arrays;
public class StringsVowels {
    public static void main(String[] args) {
        String[] inputStrings = {"apple", "banana", "orange", "grape", "pear", "kiwi"};

        Arrays.stream(inputStrings)
                .filter(StringsVowels::containsVowels)
                .forEach(s -> System.out.println("String: " + s + ", Number of Vowels: " + countVowels(s)));
    }

    public static boolean containsVowels(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static long countVowels(String s) {
        return s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
