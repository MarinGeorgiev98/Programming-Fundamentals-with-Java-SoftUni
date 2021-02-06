import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> wordSynonyms = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String currentSynonym = scan.nextLine();
            List<String> synonyms = wordSynonyms.get(word);
            if(synonyms == null) {
                synonyms = new ArrayList<>();
                wordSynonyms.put(word, synonyms);
            }
            synonyms.add(currentSynonym);
        }

       for (Map.Entry<String, List<String>> entry: wordSynonyms.entrySet()) {
           System.out.print(entry.getKey() + " - ");
           List<String> synonyms = entry.getValue();
           System.out.println(String.join(", ", synonyms));
       }
    }
}