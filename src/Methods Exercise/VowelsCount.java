import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = readString(scan);
        System.out.println(countOfVowels(text));
    }
    public static String readString(Scanner scan) {
        return scan.nextLine();
    }
    public static int countOfVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.toLowerCase().charAt(i)) {
                case 'a':
                case 'u':
                case 'o':
                case 'e':
                case 'i':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}