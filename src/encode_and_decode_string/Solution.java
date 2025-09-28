package encode_and_decode_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String letter: strs) {
            sb.append(letter.length()).append(":").append(letter);
        }

        return sb.toString();
    }

    public static List<String> decode(String str) {
        int i = 0;
        List<String> decodedString = new ArrayList<>();

        while (i < str.length()) {
            int colonPosition = str.indexOf(":", i);
            String lengthStr = str.substring(i, colonPosition);
            int length = Integer.parseInt(lengthStr);

            String word = str.substring(colonPosition + 1, colonPosition + 1 + length);
            decodedString.add(word);

            i = colonPosition + length + 1;
        }

        return decodedString;
    }

    public static void main(String[] args) {
        // ["we","say",":","yes","!@#$%^&*()"]
        List<String> strs =  Arrays.asList("neet","code","love","you");
        // List<String> strs =  Arrays.asList("we","say",":","yes","!@#$%^&*()");

        String encodedString = encode(strs);
        System.out.println("Encoded: " + encodedString);

        List<String> decodedString = decode(encodedString);
        System.out.println("Decoded: " + decodedString);

        String originalString = "4:han";
        String sub2 = originalString.substring(0, 1); // sub2 will be "Program"
        System.out.println(sub2);
    }
}
