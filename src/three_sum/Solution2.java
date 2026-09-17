package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
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