package valid_palindrome;

public class SolutionPro {
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
        String s = "Was it a car or a cat I saw?";
        // String s = "Was it a car or a cat I saw?";
        // String s = "M madam";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }
}
