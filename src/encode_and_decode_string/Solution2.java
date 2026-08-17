package encode_and_decode_string;

import java.util.List;

public class Solution2 {
    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str: strs) {
            String newString = str.length() + "#" + str;
            stringBuilder.append(newString);
        }

        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#' && Character.isDigit(str.charAt(i - 1))) {
                System.out.println(i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<String> original = List.of("neet", "code", "love", "you");

        String encoded = encode(original);
        List<String> decoded = decode(encoded);
    }
}
