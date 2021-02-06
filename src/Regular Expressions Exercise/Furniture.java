import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double finalPrice = 0;
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(
                ">>(?<name>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");
        while(!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(name);
                finalPrice = finalPrice + price * quantity;
            }
            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture
                .forEach(f -> System.out.println(f));
        System.out.printf("Total money spend: %.2f", finalPrice);
    }
}