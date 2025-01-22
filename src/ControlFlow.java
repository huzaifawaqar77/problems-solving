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


    public static void forLoops(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World! " + i);
        }
    }

    public static void forLoopsReverse(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Hello, World! " + i);
        }
    }

    public static void whileLoop(String[] args) {
        String input = "";

        while (!input.equals("quit")) {

            System.out.print("Input: ");
            Scanner sc = new Scanner(System.in);

            input = sc.next().toLowerCase();

            if (input.equals("quit")) {
                break;
            }

            System.out.println(input);
        }

    }


    public static void forEach() {
        String[] fruits = {"Apples", "Mangoes", "Oranges"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


}
