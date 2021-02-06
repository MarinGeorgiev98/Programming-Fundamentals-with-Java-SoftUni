package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Student> students = new ArrayList<>();
        while(!input.equals("end")) {
            String[] studentParts = input.split(" ");
            int age = Integer.parseInt(studentParts[2]);
            Student student = new Student(studentParts[0], studentParts[1],
                    age, studentParts[3]);
            students.add(student);

            input = scan.nextLine();
        }
        String city = scan.nextLine();

        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old.",
                        current.getFirstName(),
                        current.getLastName(),
                        current.getAge());
            }
        }
    }
}