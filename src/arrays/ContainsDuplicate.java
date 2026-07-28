package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean isDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDuplicateOptimized(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 200, 3, 2, 5, 50};
//        boolean duplicate = isDuplicate(nums);
//        System.out.println(duplicate);

        boolean duplicateOptimized = isDuplicateOptimized(nums);
        System.out.println(duplicateOptimized);
    }
}
