package longest_consecutive_sequence;

import java.util.*;

public class SolutionPro {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) numSet.add(num);

        int longest = 0;
        for (int num: numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }
                longest = Math.max(currentCount, longest);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        int ans = longestConsecutive(nums);
        System.out.println("Ans: " + ans);
    }
}
