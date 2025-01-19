import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        // Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name: ");

        String name = sc.nextLine();

        // Print the name entered by the user
        System.out.println("Hello, " + name + "!");
    }
}
