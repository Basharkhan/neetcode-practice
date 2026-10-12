package longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                l = r;
            }
            set.add(s.charAt(i));
            r++;
            count = Math.max(count, r-l);
        }

        return count;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb"; // 3
        // String s = "bbbbb"; // 1
        // String s = "pwwkew"; // 3
        // String s = "abba"; // 2
        String s = "dvdf"; // 3
        int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
        System.out.println("Result: " + lengthOfLongestSubstring);
    }
}
