import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> parking = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String command = tokens[0];
            String username = tokens[1];

            if(command.equals("register")) {
                String number = tokens[2];
                if(parking.containsKey(username)) {
                    System.out.println(String.format(
                            "ERROR: already registered with plate number %s",
                            parking.get(username)));
                }
                else {
                    parking.put(username, number);
                    System.out.println(String.format("%s registered %s successfully",
                            username, number));
                }
            }
            else {
                if (parking.containsKey(username)) {

                    parking.remove(username);
                    System.out.println(String.format("%s unregistered successfully",
                            username));
                }
                else {
                    System.out.println(String.format("ERROR: user %s not found",
                    username));
                }
            }
        }
        parking
                .entrySet()
                .forEach(e -> System.out.println(String.format(
                        "%s => %s", e.getKey(), e.getValue())));
    }
}