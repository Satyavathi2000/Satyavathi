package array;

public class Largest {
    public static void main(String[] args) {

                int[] largesmall = {10, 21, 32, 12, 27};
                int max = largesmall[0];
                int min = largesmall[0];

                for (int i = 1; i < largesmall.length; i++) {
                    if (largesmall[i] > max) {
                        max = largesmall[i];
                    } else if (largesmall[i] < min) {
                        min = largesmall[i];
                    }
                }

                // Output the results
                System.out.println("Largest number: " + max);
                System.out.println("Smallest number: " + min);
            }
        }