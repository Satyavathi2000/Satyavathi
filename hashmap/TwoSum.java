package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        // Return an array with -1 if no solution is found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = findTwoSumIndices(input, target);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Target Sum: " + target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}