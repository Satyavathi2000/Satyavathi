package hashmap;

import java.util.HashMap;

    public class DistinctCharacter {

        public static String countDistinctCharacters(String input) {
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            for (char c : input.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            StringBuilder result = new StringBuilder();
            for (char c : charCountMap.keySet()) {
                result.append(c).append("-").append(charCountMap.get(c)).append(", ");
            }

            // Removing the trailing comma and space
            return result.substring(0, result.length() - 2);
        }

        public static void main(String[] args) {
            String input = "test string";
            String result = countDistinctCharacters(input);

            System.out.println("Input: " + input);
            System.out.println("Output: " + result);
        }
    }