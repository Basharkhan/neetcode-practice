package tow_sum;

import java.util.Arrays;

// submitted
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[]{};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    indices = new int[]{i, j};
                    break;
                }
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {5, 5};
        int target = 10;

        int[] indices = twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}
