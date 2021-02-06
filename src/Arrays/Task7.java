import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[] {1, 2, 3, 4};
        String[] numbersString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            // for loop to convert int array to String array
            numbersString[i] = String.valueOf(numbers[i]);
            // convert int array elements to String array elements
        }
        System.out.println(String.join(", ", numbersString));
    }
}