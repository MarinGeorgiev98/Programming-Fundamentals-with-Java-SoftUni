import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                numbers.add(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (isValidIndex(index, numbers)) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                int element = Integer.parseInt(tokens[1]);
                if (isValidIndex(index, numbers)) {
                    numbers.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[1].equals("Shift")) {
                int rotCnt = Integer.parseInt(tokens[2]);
                if (tokens[1].equals("left")) {
                    for (int i = 0; i < rotCnt; i++) {
                        int temp = numbers.get(0);
                        for (int j = 0; j < numbers.size() - 1; j++) {
                            numbers.set(j, numbers.get(j + 1));
                        }
                        numbers.set(numbers.size() - 1, temp);
                    }
                } else {
                    for (int i = 0; i < rotCnt; i++) {
                        int temp = numbers.get(numbers.size() - 1);
                        for (int j = numbers.size() - 1; j > 0; j--) {
                            numbers.set(j, numbers.get(j - 1));
                        }
                        numbers.set(0, temp);
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    private static boolean isValidIndex(int index, List<Integer>
    numbers) {
        if (index >= 0 && index < numbers.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}