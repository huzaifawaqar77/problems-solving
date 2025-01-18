import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Building a Mortgage Calculator Application
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();


        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();

        System.out.print("Period (Years): ");
        byte years = sc.nextByte();


        double mortgage = Mortgage.calculateMortgage(principal, annualInterest, years);
        System.out.print("Your mortgage is " + mortgage);

    }
}