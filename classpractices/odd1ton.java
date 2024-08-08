package classpractices;

import java.util.Scanner;

public class odd1ton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Odd numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}