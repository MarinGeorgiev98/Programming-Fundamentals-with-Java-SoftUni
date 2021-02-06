import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int n : numbers)
            if (n % 2 == 0) {
                evenSum = evenSum + n;
            }
            else {
                oddSum = oddSum + n;
            }
        System.out.println(evenSum - oddSum);
    }
}