import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        int[] arr = new int[array1.length];
        int[] arr2 = new int[array2.length];
        int sum = 0;
        boolean isTrue = true;
        for (int i = 0; i < array1.length; i++) {
            arr[i] = Integer.parseInt(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            arr2[i] = Integer.parseInt(array2[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            if (arr[i] == arr2[i]) {
                sum = sum + arr[i];
            } else {
                int odd = arr[i];
                System.out.printf(
                        "Arrays are not identical. " +
                                "Found difference at %d index.", i);
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}