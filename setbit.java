public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        System.out.println(bitmask | n);
    }
}