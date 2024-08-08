package classpractices;
import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the maximum exponent
        System.out.print("Enter the maximum exponent: ");
        int maxExponent = scanner.nextInt();

        int exponent = 0;
        int powerOfTwo = 1;

        // Do-while loop to calculate and print the powers of 2
        do {
            System.out.println("2^" + exponent + " = " + powerOfTwo);
            powerOfTwo *= 2;
            exponent++;
        } while (exponent <= maxExponent);

        scanner.close();
    }
}
