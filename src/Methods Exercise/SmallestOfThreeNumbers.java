import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = readInteger(scan);
        int b = readInteger(scan);
        int c = readInteger(scan);

        int minNumber = findMinNumber(a, b, c);
        System.out.println(findMinNumber(a, b, c));
    }

    public static int readInteger(Scanner scan) {
        return scan.nextInt();
    }

    private static int findMinNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return  a;
        }
        else if (b < a && b <c) {
            return b;
        }
        else {
            return  c;
        }
    }
}