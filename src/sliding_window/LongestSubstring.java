package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(ch);

            maxLen = Math.max(maxLen, right - left + 1);
        }


        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcxcd"; // 3 // xyz without repeating string
        // String s = "x"; // 1

        int length = lengthOfLongestSubstring(s);
        System.out.println("Length: " + length);
    }
}
