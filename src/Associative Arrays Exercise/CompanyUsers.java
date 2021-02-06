// not 100
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> users = new HashMap<>();

        String command = scan.nextLine();

        while(!command.equals("End")) {
            String[] tokens = command.split(" -> ");
            users.putIfAbsent(tokens[0], new ArrayList<>());
             if(users.get(tokens[0]).contains(tokens[1])) {
                 command = scan.nextLine();
                 continue;
            }
            users.get(tokens[0]).add(tokens[1]);
            command = scan.nextLine();
        }

        users
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(e -> {
                    System.out.println(String.format("%s", e.getKey()));
                    e.getValue()
                            .stream()
                            .sorted((e1, e2) -> e1.compareTo(e2))
                            .forEach(c -> System.out.println(
                                    String.format("-- %s", c)));
                });
    }
}