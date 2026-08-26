package longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num: set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 2, 3};
        // int[] nums = {1};
        int longestConsecutive = longestConsecutive(nums);
        System.out.println("Count: " + longestConsecutive);
    }

}
