package classpractices;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the upper limit
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // Do-while loop to calculate the sum of even numbers
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= n);

        System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);

    }
}