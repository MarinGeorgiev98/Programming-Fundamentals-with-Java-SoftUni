import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int power = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '>') {
                result.append('>');
                power = power + Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            }
            else if (power == 0) {
                result.append(input.charAt(i));
            }
            else {
                power--;
            }
        }

        System.out.println(result);
    }
}