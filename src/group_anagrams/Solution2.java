package group_anagrams;

import java.util.*;

public class Solution2 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String string = new String(chars);

            if (map.containsKey(string)) {
                map.get(string).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(string, list);
            }

        }

        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        String[] names = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(names);
        System.out.println(lists);
    }
}
