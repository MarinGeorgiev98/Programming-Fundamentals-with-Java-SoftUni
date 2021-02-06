import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String values = scan.nextLine();
        String[] items = values.split(" ");
        int arr[] = new int[items.length]; // It's string now, so we parse it...
        for ( int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]); //...in int.
        }
    }
}