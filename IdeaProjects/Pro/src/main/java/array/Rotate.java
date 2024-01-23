package array;

public class Rotate {

        static void leftRotate(int arr[], int d) {
            int n = arr.length;

            // Create a temporary array to store the rotated elements
            int temp[] = new int[d];

            // Store the first d elements in the temporary array
            for (int i = 0; i < d; i++)
                temp[i] = arr[i];

            // Shift the remaining elements to the left
            for (int i = d; i < n; i++)
                arr[i - d] = arr[i];

            // Copy the rotated elements back to the original array
            for (int i = 0; i < d; i++)
                arr[n - d + i] = temp[i];
        }

        // Function to print an array
        static void printArray(int arr[]) {
            for (int value : arr)
                System.out.print(value + " ");
        }

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            int x = 2;

            // Rotate the array left by x positions
            leftRotate(arr, x);

            // Print the rotated array
            printArray(arr);
        }
    }


