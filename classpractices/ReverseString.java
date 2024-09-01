package classpractices;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Reverse the string using the reverseString function
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
