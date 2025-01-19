import java.util.Scanner;

public class Mortgage {
    public static double calculateMortgage(String[] args) {

        // Building a Mortgage Calculator Application
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();


        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();

        System.out.print("Period (Years): ");
        byte years = sc.nextByte();


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        float monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.println("Your mortgage is " + mortgage);

        return mortgage;
    }
}
