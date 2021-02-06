import java.util.*;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (counts.containsKey(lowercaseWord)) {
                counts.put(lowercaseWord, counts.get(lowercaseWord) + 1);
            }
            else {
                counts.put(lowercaseWord, 1);
            }
        }

        List<String> odds = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i == odds.size() - 1) {
                break;
            }
            System.out.print(", ");
        }
    }
}