package longest_consecutive_sequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution3 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num: nums) {
            set.add(num);
        }

        int starting = -1;

        for (int num: nums) {
            if (!set.contains(num - 1)) {
                System.out.println("Starting: " + num);
                if (set.contains(num + 1)) {
                    System.out.println(num + 1);
                }
            }
        }
        System.out.println(list);
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 2, 3};
        int longestConsecutive = longestConsecutive(nums);
        System.out.println("Hi: " + longestConsecutive);
    }

}
