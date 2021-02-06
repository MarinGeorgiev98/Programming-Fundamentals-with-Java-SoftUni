import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("\\+359([\\- ])2(\\1)\\d{3}(\\1)\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> phoneNums = new ArrayList<>();
        while (matcher.find()) {
            phoneNums.add(matcher.group());
        }

        System.out.printf(String.join(", "), phoneNums);
    }
}