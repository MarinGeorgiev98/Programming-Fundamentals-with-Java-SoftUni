import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> left = readList(scan);
        List<Integer> right = readList(scan);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        // we write it here to be able to check with if afterwards
        for (i = 0; i < left.size() && i < right.size(); i++) {
            result.add(left.get(i));
            result.add(right.get(i));
        }

        if (i < left.size()) {
            addLeftOrRight(result, left, i);
        }
        else if(i < right.size()) {
            addLeftOrRight(result, right, i);

        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static void addLeftOrRight(
            List<Integer> sampleList, List<Integer> sampleList2, int i) {
        for (int j = i; j < sampleList2.size(); j++) {
            sampleList.add(sampleList2.get(j));
        }
    }

    public static List<Integer> readList (Scanner scan) {
        String [] splitInput = scan.nextLine().split(" ");
        List<Integer> result =
                Arrays.stream(splitInput)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        return result;
    }
}