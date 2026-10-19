package longest_repeating_character_replacement;

public class Solution {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];



        return -1;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int count = characterReplacement(s, k);
        System.out.println("Result: " + count);
    }
}
