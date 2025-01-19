import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your role: ");
        String role = sc.next();


        int num = 50;

        int isDivisible = (num % 5);

        System.out.println("Number moduli 5 givs us: " + isDivisible);

        switch (role) {
            case "admin":
                System.out.println("Your role is admin");
                break;
            case "manager":
                System.out.println("Your role is manager");
                break;
            case "employee":
                System.out.println("Your role is employee");
                break;
            default:
                System.out.println("You donot have access. ---Undefined role---");

        }


    }
}
