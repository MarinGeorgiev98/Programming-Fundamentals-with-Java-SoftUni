import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegatives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < 0) {
                numbers.remove(i);
                i--;
            }
        }

        Collections.reverse(numbers);

        if (numbers.size() == 0) {
            System.out.println("empty");
        }
        PrintList(numbers);
    }
    public static void PrintList(List<Integer> lines) {
        for (int item : lines) {
            System.out.print(item + " ");
        }
    }
}