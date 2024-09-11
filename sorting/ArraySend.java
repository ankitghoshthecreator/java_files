package sorting;
import java.util.*;

public class ArraySend {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=in.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        SelectionSort.sort(arr);
    }  
}
