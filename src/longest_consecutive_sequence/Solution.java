package longest_consecutive_sequence;

import java.util.*;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        List<Integer> integers = new ArrayList<>();

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int count = 1;
        for (int i = 0; i < sortedNums.length - 1; i++) {
            if (sortedNums[i + 1] == sortedNums[i]) {
                continue;
            }

            if ((sortedNums[i + 1] - sortedNums[i]) == 1) {
                count++;
            } else {
                integers.add(count);
                count = 1;
            }

            if (i == (sortedNums.length - 2)) {
                integers.add(count);
            }
        }
        integers.add(count);

        return Collections.max(integers);
    }

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        int ans = longestConsecutive(nums);
        System.out.println("ans: " + ans);
    }
}
