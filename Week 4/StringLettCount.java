import java.util.LinkedHashMap;
import java.util.Map;

public class StringLettCount {
    public static void printCharacterCount(String input) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.printf("%c-%d, ", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        String inputString = "test string";
        printCharacterCount(inputString);
    }
}
