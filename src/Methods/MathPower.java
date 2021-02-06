import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        int pow = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(result(num, pow)));
    }

    private static double result(double num, int pow) {
        double result = pow(num, pow);
        return result;
    }
}