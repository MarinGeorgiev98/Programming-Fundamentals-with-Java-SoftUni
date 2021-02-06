import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        boolean isCorrect = isvalidPassword(password);
        boolean digitsOrLetters = containsThem(password);
        boolean doesItHave2Digits = twoDigits(password);
        boolean isValid = isCorrect && digitsOrLetters && doesItHave2Digits;
        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isvalidPassword(String password) {
        if (6 <= password.length() && password.length() <= 10) {
            return true;
        }
        else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean containsThem(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if(!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean twoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                counter ++;
                if (counter == 2) {
                    return true;
                }
            }
        }
        if (counter == 2) {
            return true;
        }
        else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}