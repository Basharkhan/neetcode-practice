package group_anagrams;

import java.util.*;

public class Solution3 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for (String word: strs) {
            Arrays.fill(count, 0);

            for (char ch: word.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println("List: " + lists);
    }
}
