package top_k_frequent_elements;

import java.util.*;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> kFrequent = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(k)
                .toList();

        return kFrequent.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}
