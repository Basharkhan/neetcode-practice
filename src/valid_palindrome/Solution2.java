package valid_palindrome;

public class Solution2 {
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; // → true
        // String s = "noon"; // true
        // String s = "race a car"; // → false
        // String s = " "; // → true
        boolean palindrome = isPalindrome(s);
        System.out.println("Result: " + palindrome);
    }
}
