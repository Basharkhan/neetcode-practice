package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && (nums[l] == nums[l - 1])) {
                        l++;
                    }

                    while (l < r && (nums[r] == nums[r + 1])) {
                        r--;
                    }
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4}; // [[-1, -1, 2], [-1, 0, 1]]
        // int[] nums = {0, 0, 0}; // [0, 0, 0]
        // int[] nums = {-2, 0, 0, 2, 2}; // [[-2, 0, 2]]
        List<List<Integer>> lists = threeSum(nums);
        System.out.println("Result: " + lists);
    }
}