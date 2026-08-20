package encode_and_decode_string;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str: strs) {
            stringBuilder.append(str.length())
                    .append("#")
                    .append(str);
        }

        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        System.out.println("Encoded: " + str);
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiter));

            int start = delimiter + 1;
            int end = start + length;

            String word = str.substring(start, end);
            result.add(word);

            i = end;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> original = List.of("neet", "codeeeeeeeeee", "love", "you");

        String encoded = encode(original);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }
}
