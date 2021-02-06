import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        double courses = Math.ceil(a * 1.0 / b);
        System.out.printf("%.0f", courses);
    }
}