package valid_palindrome;

public class Solution {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = cleaned.length();

        while (l < r) {
            if (cleaned.charAt(l) != cleaned.charAt(r - 1)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }
}
