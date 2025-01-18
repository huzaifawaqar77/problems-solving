import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double num = 12.3423213;
        DecimalFormat twoPoints = new DecimalFormat();

        twoPoints.setMaximumFractionDigits(2);

        // A very short and simple way to get the answer upto 2 precision points is to use the "%.2f" method
        // You just need to type System.out.printf("%.2f", 123.4234234) and it will give you the result 123.45

        System.out.println(twoPoints.format(num));


        System.out.println("Enter the guest names");
        String guest1 = scanner.next();
        String guest2 = scanner.next();
        String guest3 = scanner.next();
        String guest4 = scanner.nextLine();

        System.out.println(guest4);
        System.out.println(guest3);
        System.out.println(guest2);
        System.out.println(guest1);

    }
}