import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> items = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));
        }
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] arr = input.split(" ");
            if (arr[0].equals("Delete")) {
                int token = Integer.parseInt(arr[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (token == numbers.get(i)) {
                        numbers.remove(i);
                    }
                }
            } else if (arr[0].equals("Insert")) {
                int element = Integer.parseInt(arr[1]);
                int position = Integer.parseInt(arr[2]);
                numbers.add(position, element);
            }
            input = scan.nextLine();
        }
        printList(numbers);
    }
    public static void printList (List<Integer> numbers){
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}