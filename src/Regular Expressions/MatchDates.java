import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        Pattern pattern = Pattern.compile
                ("(?<day>\\d{2})([.\\-\\/])(?<month>[A-Z][a-z]{2})(\\1)(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}