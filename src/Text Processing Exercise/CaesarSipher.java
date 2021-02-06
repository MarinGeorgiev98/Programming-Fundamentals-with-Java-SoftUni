import java.util.Scanner;

public class CaesarSipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char letter = (char) (message.charAt(i) + 3);
            sb.append(letter);
        }
        System.out.println(sb);
    }
}