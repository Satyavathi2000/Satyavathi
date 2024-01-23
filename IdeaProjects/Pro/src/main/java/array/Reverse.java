package array;

import java.util.Arrays;

public class Reverse {
public static void main(String[] args ) {
int[] arr = {1,2,3,4,5};
int n = arr.length;
int[] reversed = new int[n];
for (int i = 0; i<n; i++) {
    reversed[i] = arr[n - i -1];
}
System.out.println("Original array: "+ Arrays.toString(arr));
System.out.println("Reversed array: "+ Arrays.toString(reversed));
}
}
