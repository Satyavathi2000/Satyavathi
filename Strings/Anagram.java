package Strings;
import java.util.Arrays;
public class Anagram {

        static boolean areAnagrams(String str1, String str2) {
            // Remove spaces and convert to lowercase for case-insensitive comparison
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if the sorted characters of both strings are the same
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String string1 = "Below";
            String string2 = "Elbow";

            if (areAnagrams(string1, string2)) {
                System.out.println(string1 + " and " + string2 + " are anagrams.");
            } else {
                System.out.println(string1 + " and " + string2 + " are not anagrams.");
            }
        }
    }

