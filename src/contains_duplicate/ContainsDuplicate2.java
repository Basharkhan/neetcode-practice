package contains_duplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = Math.abs(map.get(nums[i]) - i);
                if (value <= k) return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static boolean containsNearbyDuplicateImproved(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 1}; // k = 3 true
        // int[] nums = {2,1,2}; // k = 1 false
        // int[] nums = {1, 0, 1, 1}; // k = 1 true
        // int[] nums = {1, 2, 3, 1, 2, 3}; // k = 2 false
        int k = 2;

        boolean containsNearbyDuplicate = containsNearbyDuplicateImproved(nums, k);
        System.out.println(containsNearbyDuplicate);

        // Set<Integer> numbers = new
    }
}
