import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bigNum = scan.nextLine();
        int multiplier = Integer.parseInt(scan.nextLine());
        if(multiplier == 0) {
            return;
        }
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(bigNum.charAt(i)));
            int product = digit * multiplier + reminder;
            result.append(product % 10);
            reminder = product / 10;
        }

        if(reminder != 0) {
            result.append(reminder);
        }
        System.out.println(result.reverse());
    }
}