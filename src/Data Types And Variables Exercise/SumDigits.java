import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sum = sum + lastDigit;
        }
        System.out.println(sum);
    }
}