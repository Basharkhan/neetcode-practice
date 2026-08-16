package top_k_frequent_elements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution2 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue =
                new PriorityQueue<>((a, b) -> frequency.get(a) - frequency.get(b));

        for (int num: frequency.keySet()) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        // producing result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {7, 7, 8, 8, 8, 9, 9, 9, 9};
        int k = 2;
        int[] ints = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ints));
    }
}
