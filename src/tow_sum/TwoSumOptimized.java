package tow_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 5 10 20 // 15

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 20};
        int target = 15;

        int[] indices = twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}
