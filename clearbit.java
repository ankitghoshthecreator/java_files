public class clearbit {
    public static void main(String[] args) {
        int num = 5;
        int bitmask = 1 << 2;
        int notbit = ~(bitmask);
        System.out.println(notbit & num);
    }
}
