package nl.schoepping;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        Scanner scanner = new Scanner(System.in);
        int principal;
        double annualRate;
        int numberOfYears;
        while (true) {
            System.out.print("Principal (€1000 - €1.000.000): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            else
                System.out.println("Principal must be between €1000 en €1.000.000");
        }
        while (true) {
            System.out.print("Annual interest rate (1-9): ");
            annualRate = scanner.nextDouble();
            if (annualRate >= 1 && annualRate <= 9)
                break;
            else
                System.out.println("Annual Income Rate must be between 1 and 9");
        }
        while (true) {
            System.out.print("Number of years (1-30): ");
            numberOfYears = scanner.nextInt();
            if (numberOfYears >= 1 && numberOfYears <= 30)
                break;
            else
                System.out.println("Number of years must be between 1 and 30");
        }
        double pow = Math.pow(1 + annualRate / (MONTHS_IN_YEAR * PERCENTAGE), numberOfYears * MONTHS_IN_YEAR);
        double mortgage = principal * (annualRate/(MONTHS_IN_YEAR * PERCENTAGE)) * pow / (pow - 1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
