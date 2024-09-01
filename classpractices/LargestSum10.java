package classpractices;
import java.util.*;

public class LargestSum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Calculate sum
            if (numbers[i] > largest) {
                largest = numbers[i]; // Find largest
            }
        }

        // Output the results
        System.out.println("Sum of the 10 numbers: " + sum);
        System.out.println("Largest number: " + largest);
    }
}
