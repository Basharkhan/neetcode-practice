package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Set<Character> window = new HashSet<>();
        int left = 0;

        int maxCount = Integer.MIN_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(ch);

            int current = right - left;
                    maxCount = Math.max(maxCount, current);
            System.out.println("Char: " + ch);
            System.out.println(current);
        }
        System.out.println(maxCount);

        return 0;
    }

    public static void main(String[] args) {
        // String s = "XYYX";
        String s =  "AAABABBBB";
        int k = 2;
        int replacement = characterReplacement(s, k);
        System.out.println("Replacement: " + replacement);
    }
}
