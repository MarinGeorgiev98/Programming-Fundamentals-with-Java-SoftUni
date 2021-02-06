import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum1 = 0;
        while (input.equals("END")) {
            for (int i = 0; i < input.length(); i++) {
                sum1 = sum1 + input.charAt(i);
            }
        }
        System.out.println(sum1);
    }
}