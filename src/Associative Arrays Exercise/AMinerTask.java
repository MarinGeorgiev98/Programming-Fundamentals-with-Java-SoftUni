import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String input = scan.nextLine();

        while(!input.equals("stop")) {
            int count = Integer.parseInt(scan.nextLine());

            if(!resources.containsKey(input)) {
                resources.put(input, 0);
            }
            resources.put(input, resources.get(input) + count);

            input = scan.nextLine();
        }

        resources
                .forEach((k, v) -> System.out.println(
                        String.format("%s -> %d", k, v)));
    }
}