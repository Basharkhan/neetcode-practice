package longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(i));
            count = Math.max(count, i - l + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcbb"; // 3
        // String s = "bbbbb"; // 1
        // String s = "pwwkew"; // 3
        // String s = "abba"; // 2
        // String s = "dvdf"; // 3
        int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
        System.out.println("Result: " + lengthOfLongestSubstring);
    }
}
