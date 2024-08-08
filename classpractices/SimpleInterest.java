package classpractices;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for principal, rate, and number of years
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.println("Yearly Simple Interest Calculation:");

        // Loop through each year and calculate the simple interest
        for (int i = 1; i <= years; i++) {
            double simpleInterest = (principal * rate * i) / 100;
            System.out.println("Year " + i + ": Simple Interest = " + simpleInterest);
        }

        scanner.close();
    }
}