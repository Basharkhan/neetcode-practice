package valid_anagram;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map1.containsKey(c)){
                int currentValue = map1.get(c);
                map1.put(c, currentValue + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (map2.containsKey(c)){
                int currentValue = map2.get(c);
                map2.put(c, currentValue + 1);
            } else {
                map2.put(c, 1);
            }
        }

        if (map1.equals(map2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
}
