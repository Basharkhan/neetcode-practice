package valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramPro {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            countS.put(char1, countS.getOrDefault(char1, 0) + 1);
            countT.put(char2, countT.getOrDefault(char2, 0) + 1);
        }

        return countS.equals(countT);
    }

    public static void main(String[] args) {
        String s = "abccx", t = "cabcy";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
}
