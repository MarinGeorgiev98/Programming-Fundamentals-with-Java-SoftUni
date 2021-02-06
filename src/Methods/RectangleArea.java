import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        System.out.println(calculateArea(width, height));
    }
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}