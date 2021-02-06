import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        switch (text) {
            case "subtract":
                subtract(num1, num2);
        }
    }
    public static void subtract(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}