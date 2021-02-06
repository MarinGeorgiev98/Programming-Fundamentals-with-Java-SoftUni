import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] tokens = input.split(" ");
            if (tokens[2].equals("going!")) {
                if (guests.contains(tokens[0])) {
                    System.out.printf("%s is already in the list!", tokens[0]);
                    System.out.println();
                }
                else if (!guests.contains(tokens[0])) {
                    guests.add(tokens[0]);
                }
            }
            if (tokens[2].equals("not")) {
                if (guests.contains(tokens[0])) {
                    guests.remove(tokens[0]);
                }
                else if (!guests.contains(tokens[0])) {
                    System.out.printf("%s is not in the list!", tokens[0]);
                    System.out.println();
                }
            }
        }
        printList(guests);
    }
    public static void printList(List<String> guests) {
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}