package tow_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(num, i);
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
