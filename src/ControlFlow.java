import java.util.Scanner;

public class ControlFlow {
    public static void voteEligibilityChecker(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote here.");
        }
    }

    public static void positiveNegativeChecker(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter The Number That You Want To Check: ");

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number you entered is a positive number");
        } else {
            System.out.println("The number you entered is a negative number");
        }

    }
}
