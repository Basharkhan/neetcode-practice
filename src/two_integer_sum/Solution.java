package two_integer_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int requiredNum = target - numbers[i];

            if (map.containsKey(requiredNum)) {
                return new int[]{map.get(requiredNum) + 1, i + 1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 3;

        int[] result = twoSum(nums, target);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
