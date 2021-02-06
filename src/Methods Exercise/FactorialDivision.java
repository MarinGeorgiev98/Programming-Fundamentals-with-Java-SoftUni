import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = Integer.parseInt(scan.nextLine());
        double sum1 = firstNumber(n1);
        double n2 = Integer.parseInt(scan.nextLine());
        double sum2 = SecondNumber(n2);
        System.out.printf("%.2f", sum1 / sum2);
    }

    public static double firstNumber (double n1) {
        double sum1 = 1;
        for (int i = 1; i <= n1; i++) {
            sum1 = sum1 * i;
        }
        return  sum1;
    }

    public static double SecondNumber(double n2) {
        double sum2 = 1;
        for (int i = 1; i <= n2; i++) {
            sum2 = sum2 * i;
        }
        return sum2;
    }
}