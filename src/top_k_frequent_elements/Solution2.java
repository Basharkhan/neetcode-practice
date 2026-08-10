package top_k_frequent_elements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution2 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {7, 7, 8, 8, 8, 9, 9, 9, 9};
        int k = 2;
        int[] ints = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ints));
    }
}
