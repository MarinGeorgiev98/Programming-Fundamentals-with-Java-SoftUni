import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[arr.length - 1]);
        //Thus we find the last element - we should print it.
    }
}