package Arrays;

import java.util.Scanner;

public class enhancedforarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("enter the 5 elements");
        // taking the input
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        // output
        System.out.println("the array is");
        for (int i : a) {
            System.out.println(i);
        }

    }
}
