import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder result = new StringBuilder();
        char letter = input.charAt(0);
        result.append(letter);
        for (int i = 1; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            if(letter != currentLetter) {
                result.append(currentLetter);
                letter = currentLetter;
            }
        }

        System.out.println(result);
    }
}