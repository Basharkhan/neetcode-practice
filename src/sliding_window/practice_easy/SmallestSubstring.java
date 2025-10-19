package sliding_window.practice_easy;

// https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1
public class SmallestSubstring {
    public static int findSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '0' || ch == '1' || ch == '2') {
                System.out.println("Index: " + i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "01212";
        int substring = findSubstring(s);
        System.out.println("Result: " + substring);
    }
}
