package valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramAgain {
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {

            } else {
                map1.put(s.charAt(i), 0);
            }
        }

        return true;
    }

    // this function only handles lower case letter
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int j : count) {
            if (j != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
}
