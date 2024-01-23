package array;

public class Sorting{
public static void main(String[] args) {
    // Sample array
    int[] arr = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Array:");
    displayArray(arr);

    quickSort(arr, 0, arr.length - 1);

    System.out.println("\nArray after sorting:");
    displayArray(arr);
}

private static void quickSort(int[] nums, int low, int high) {
    if (low < high) {
        // Partition the array, nums[pivot] is now at the correct position
        int pivot = partition(nums, low, high);

        // Recursively sort the sub-arrays
        quickSort(nums, low, pivot - 1);
        quickSort(nums, pivot + 1, high);
    }
}

private static int partition(int[] nums, int low, int high) {
    int pivot = nums[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (nums[j] <= pivot) {
            i++;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    int temp = nums[i + 1];
    nums[i + 1] = nums[high];
    nums[high] = temp;

    return i + 1;
}

private static void displayArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}