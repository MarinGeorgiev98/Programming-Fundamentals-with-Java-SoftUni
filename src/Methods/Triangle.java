import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            //this for prints rows number - the whole column of rows
            //...up to n
            printRow(i);
        }
        for (int i = n - 1; i > 0 ; i--) {
            printRow(i);
        }
    }
    public static void printRow (int rowCount) {
        for (int i = 1; i <= rowCount; i++) {
            // this for prints every row
            System.out.print(i + " ");
        }
        System.out.println();
    }
}