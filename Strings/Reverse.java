package Strings;

public class Reverse {
        static String reverseEachWord(String sentence) {
            String[] words = sentence.split(" ");

            StringBuilder reversedSentence = new StringBuilder();

            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversedSentence.append(reversedWord).append(" ");
            }

            // Remove the trailing space
            return reversedSentence.toString().trim();
        }

        public static void main(String[] args) {
            String inputSentence = "Java J2EE Reverse Me";
            String outputSentence = reverseEachWord(inputSentence);

            System.out.println("Input: " + inputSentence);
            System.out.println("Output: " + outputSentence);
        }
    }


