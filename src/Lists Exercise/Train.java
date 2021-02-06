import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> train = readInList(scan);
        int waggonCapacity = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                train.add(Integer.parseInt(tokens[1]));
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (people + train.get(i) <= waggonCapacity) {
                        train.set(i, train.get(i) + people);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < train.size(); i++) {
            System.out.print(train.get(i) + " ");
        }
    }
    public static List<Integer> readInList (Scanner scan){
        String[] input = scan.nextLine().split(" ");
        List<Integer> outPutList = new ArrayList<>();

        for (String element : input) {
            outPutList.add(Integer.parseInt(element));
        }
        return outPutList;
    }
}