import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        List<String> items = Arrays.stream(line.split(" "))
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));
        }

        int iterationCount = numbers.size() / 2;
        // it is not in the for loop, because if it is,
        // it will change its number of iterations - it's a list
        for (int i = 0; i < iterationCount; i++) {
            int currentSum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            numbers.set(i, currentSum);
        }
        for (int i = 0; i < numbers.size(); i++) {
            // = for (int num: numbers) {
            // System.out.print(number + " "); }
            System.out.print(numbers.get(i) + " ");
        }
    }
}