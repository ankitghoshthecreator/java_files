package classpractices;
import java.util.Scanner;

public class PositiveNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop to continuously prompt for a positive number
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (number <= 0);

        System.out.println("You entered a valid positive number: " + number);

        scanner.close();
    }
}
