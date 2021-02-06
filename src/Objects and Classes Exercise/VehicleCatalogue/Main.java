package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Vehicles> vehicles = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            int horsePower = Integer.parseInt(tokens[3]);
            Vehicles vehicle;
            if (tokens[0].equals("car")) {
                vehicle = new Vehicles
                        ("Car", tokens[1], tokens[2], horsePower);
                vehicles.add(vehicle);
            } else {
                vehicle = new Vehicles
                        ("Truck", tokens[1], tokens[2], horsePower);
                vehicles.add(vehicle);
            }
            input = scan.nextLine();
        }

        String model = scan.nextLine();
        while (!"Close the Catalogue".equals(model)) {
            model = scan.nextLine();
            for (Vehicles vehicle : vehicles) {
                if (vehicle.getType().equals(model)) {
                    System.out.println(vehicle);
                    break;
                }
            }
            model = scan.nextLine();
        }
        double carHP = printHorsePower(vehicles, "Car");
        double truckHP = printHorsePower(vehicles, "Truck");
    }

    public static double printHorsePower(List<Vehicles> vehicles, String type) {
        double sum = 0.0;
        int counter = 0;
        for (Vehicles vehicle : vehicles) {
            if (vehicle.getModel().equals(type)) {
                sum = sum + vehicle.getHorsePower();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}