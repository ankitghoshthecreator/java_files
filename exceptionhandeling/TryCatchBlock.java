package exceptionhandeling;

public class TryCatchBlock {

    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println(c);  
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("helllo");
    }
    
}
