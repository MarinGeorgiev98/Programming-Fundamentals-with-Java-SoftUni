import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input1 = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");
        for (String i1 : input1) {
            for (String i2 : input2) {
                if (i1.equals(i2)) {
                    System.out.println(i1 + " ");
                }
            }
        }
    }
}