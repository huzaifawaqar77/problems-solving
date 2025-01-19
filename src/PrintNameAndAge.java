import java.util.Scanner;

public class PrintNameAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        String age = sc.nextLine();

        // Simplifying Conditions
        int income = 120_000;

        boolean hasHighIncome = (income > 100_000);

        System.out.println(hasHighIncome);

        // Print the message using the user's name and age.
        System.out.println("Hello, I am " + name + " I am " + age + " years old.");
        sc.close();
    }
}
