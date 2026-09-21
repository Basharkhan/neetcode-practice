package two_sum_2;

import java.util.Arrays;

public class TwoSumTwo {
    public static int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum > target) {
                r--;
            } else if (sum < target){
                l++;
            } else {
                return new int[]{l+1, r+1};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] ints = twoSum(nums, target);
        System.out.println("Result: " + Arrays.toString(ints));
    }
}
