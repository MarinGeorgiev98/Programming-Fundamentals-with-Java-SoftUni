import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulatingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String line = scan.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] arr = line.split(" ");
            switch (arr[0]) {
                case "Contains":
                    int containedNum = Integer.parseInt(arr[1]);
                    if(numbers.contains(containedNum)) {
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if(arr[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (arr[1].equals("odd")){
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum = sum + numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (arr[1].equals("<")) {
                        int arrElement = Integer.parseInt(arr[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (arrElement > numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                        }
                    }
                        System.out.println();
                }
                    if(arr[1].equals(">")) {
                        int arrElement = Integer.parseInt(arr[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if(arrElement < numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if(arr[1].equals("<=")) {
                        int arrElement = Integer.parseInt(arr[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if(arrElement >= numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if(arr[1].equals(">=")) {
                        int arrElement = Integer.parseInt(arr[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if(arrElement <= numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                        }
                    }
                        System.out.println();
                }
                    break;
            }
        }
    }
}