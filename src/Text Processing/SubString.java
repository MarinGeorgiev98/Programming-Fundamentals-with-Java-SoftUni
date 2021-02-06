import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String toRemove = scan.nextLine();
        String text = scan.nextLine();

        while (text.contains(toRemove)) {
            int index = text.indexOf(toRemove);
            int toRemoveLength = toRemove.length();
            text = text.substring(0, index) + text.substring(index + toRemoveLength);
        }
        System.out.println(text);
    }
}