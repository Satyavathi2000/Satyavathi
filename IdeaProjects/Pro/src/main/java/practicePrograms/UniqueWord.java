package practicePrograms;

import java.util.HashMap;

public class UniqueWord {
    public static void main(String[] args) {
        String inputString = "This is lakshmi kiranmai A Passionate software developer";

        // Calling the method to count unique words
        int uniqueWordCount = countUniqueWords(inputString);

        System.out.println("Number of unique words: " + uniqueWordCount);
    }

    public static int countUniqueWords(String inputString) {
        // Splitting the input string into words
        String[] words = inputString.split("\\s+");

        // Creating a HashMap to store word frequencies
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Counting the frequency of each word
        for (String word : words) {
            // Removing punctuation and converting to lowercase for better accuracy
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Updating the word frequency in the HashMap
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Counting the number of unique words
        int uniqueWordCount = 0;
        for (int frequency : wordFrequencyMap.values()) {
            if (frequency == 1) {
                uniqueWordCount++;
            }
        }

        return uniqueWordCount;
    }
}