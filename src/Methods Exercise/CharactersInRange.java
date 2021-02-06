import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char last = scan.nextLine().charAt(0);

        if (first > last) {
            printSymbols(last, first);
        }
        else {
            printSymbols(first, last);
        }
    }

    private static void printSymbols(char first, char last) {
        for (int i = first + 1; i < last; i++) {
            System.out.printf("%c ", i);
        }
    }
}