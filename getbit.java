import java.util.*;

public class getbit {
    public static void main(String[] args) {
        int n = 5, pos = 3;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("it was 0");
        } else {
            System.out.println("it was 1");
        }
    }
}
