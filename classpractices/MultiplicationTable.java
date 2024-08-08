package classpractices;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the number
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        int multiplier = 1;

        // Do-while loop to print the multiplication table
        do {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        } while (multiplier <= 10);

        scanner.close();
    }
}
