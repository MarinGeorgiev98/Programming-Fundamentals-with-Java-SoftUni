import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String[] words = scan.nextLine().split(" ");

            String result = "";

        for (int i = 0; i < words.length; i++) {
            result = result + repeatWord(words[i]);
        }

        System.out.println(result);
    }

    public  static String repeatWord (String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word;
        }
        return  result;
    }
}