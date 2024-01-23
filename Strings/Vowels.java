package Strings;
public class Vowels {
        void count() {
            int vowels = 0, consonants = 0;
            String str = "Hello, World!";  // You can set the default value here
            str = str.toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    vowels++;
                else
                    consonants++;
            }
            System.out.println("Number of Vowels: " + vowels);
            System.out.println("Number of Consonants: " + consonants);
        }

        public static void main(String[] args) {
            Vowels vowelCounter = new Vowels();
            vowelCounter.count();
        }
    }




