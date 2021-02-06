import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] phrases = new String[] {"wefo", "edjiwerji", "sjiweiowe"};
        String[] events = {"efweiwe", "qwejlwej", "sdfiweri"};
        String[] authors = {"sefjefise", "erwerwer", "weowewef"};
        String[] cities = {"Sofia", "Varna", "Plovdiv"};

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            String phrase = phrases[random.nextInt(phrases.length)];
            String event = events[random.nextInt(events.length)];
            String author = authors[random.nextInt(authors.length)];
            String city = cities[random.nextInt(cities.length)];
            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}