package practicePrograms;

import java.util.Scanner;
    public class Palindrome {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number or string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }

            scanner.close();
        }

        // Function to check if a number or string is a palindrome
        public static boolean isPalindrome(String str) {
            str = str.toLowerCase();  // Convert the string to lowercase for case-insensitive comparison
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        // Overloaded function to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
            int originalNum = num;
            int reversedNum = 0;

            while (num > 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            return originalNum == reversedNum;
        }
    }

