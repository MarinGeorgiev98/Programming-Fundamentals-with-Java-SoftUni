import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        int min = Math.min(first.length(), second.length());
        int max = Math.max(first.length(), second.length());
        Multiplier(first, second, min, max);
    }

    public static void Multiplier(String first, String second, int min, int max) {
        int result = 0;
        for (int i = 0; i < max; i++) {
            if (i < min) {
                result += first.charAt(i) * second.charAt(i);
            } else if (first.length() == max) {
                result += first.charAt(i);
            } else if (second.length() == max) {
                result += second.charAt(i);
            }
        }
        System.out.println(result);
    }
}