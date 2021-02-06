import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] stringNums = scan.nextLine().split(" ");

        double[] nums = new double[stringNums.length];

        for (int i = 0; i < stringNums.length; i++) {
            nums[i] = Double.parseDouble(stringNums[i]);
        }

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for(double num: nums) {
            if(!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
        for(Map.Entry<Double, Integer> element: counts.entrySet()) {
            System.out.printf("%s -> %d%n", element.getKey(), element.getValue());
        }
    }
}