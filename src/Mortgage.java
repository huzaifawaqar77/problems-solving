import java.util.Scanner;

public class Mortgage {
    public static double calculateMortgage(String[] args) {

        // Building a Mortgage Calculator Application
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal ($1k to $1M): ");
        int principal = sc.nextInt();

        while (true) {


            if (principal < 1000 || principal > 1000000) {
                System.out.println("Enter a value greater than 1k and less than 1M");
                principal = sc.nextInt();
                continue;
            } else {
                break;
            }

        }


        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        while (true) {
            if (annualInterest < 0 || annualInterest > 30) {
                System.out.println("Annual Interest should be greater than 0% and less than 30%");
                annualInterest = sc.nextFloat();
                continue;
            } else {
                break;
            }
        }

        System.out.print("Period (Years): ");
        byte years = sc.nextByte();

        while (true) {
            if (years < 0 || years > 30) {
                System.out.println("Years shoud be greater than 0 and less than 30");
                years = sc.nextByte();
                continue;
            } else {
                break;
            }
        }


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
