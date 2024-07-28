package arrays;

import java.util.*;

public class introarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the 5 elements in java");
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();

        }
        System.out.println("the array is");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);

        }
    }
}
