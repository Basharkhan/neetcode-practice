package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class VariableWindow {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ABCDBEA";
        // String s = "ertaaabc";
        int count = lengthOfLongestSubstring(s);
        System.out.println(count);
    }
}
