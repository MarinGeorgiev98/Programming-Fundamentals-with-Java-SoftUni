import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] firstArr = new String[n];
        String[] secArr = new String[n];
        for (int i = 0; i < n; i++) {
            String[] currentLine = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = currentLine[0];
                secArr[i] = currentLine[1];
            }
            else {
                firstArr[i] = currentLine[1];
                secArr[i] = currentLine[0];
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secArr));
    }
}