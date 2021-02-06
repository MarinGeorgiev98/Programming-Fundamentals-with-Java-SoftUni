import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        List <String> items = Arrays.stream(line.split(" ")).
                collect(Collectors.toList());

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            numbers.add(Double.parseDouble(items.get(i)));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, sum);
                i = -1;  // because we should start from 0 and we have i++
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(new DecimalFormat("0.# "). format(numbers.get(i)));
        }
    }
}