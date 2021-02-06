import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();

        Map<Character, Integer> letters = new LinkedHashMap<>();

        for (char letter : input) {
            if (letter == ' ') {
                continue;
            }
            if(!letters.containsKey(letter)) {
                letters.put(letter, 0);
            }
            letters.put(letter, letters.get(letter) + 1);
        }

        for(Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.printf("%c -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}