import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < banWords.length; i++) {
                if (text.contains(banWords[i])) {
                    String replacement = "";
                    for (int k = 0; k < banWords[i].length(); k++) {
                        replacement = replacement + "*";
                    }
                    text = text.replace(banWords[i], replacement);
                }
            }
        System.out.println(text);
    }
}