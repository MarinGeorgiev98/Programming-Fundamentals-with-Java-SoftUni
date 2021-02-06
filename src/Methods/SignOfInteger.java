import java.util.Scanner;

public class SignOfInteger {

    public static void printSign(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive", num);
        }
        else if (num < 0) {
            System.out.printf("The number %d is negative", num);
        }
        else if (num == 0) {
            System.out.printf("The number %d is zero", num);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        printSign(number);
    }
}