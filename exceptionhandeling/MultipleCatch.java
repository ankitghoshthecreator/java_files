package exceptionhandeling;

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int a = 10, b = 8;
            int c = a / b;

            int z[]=new int[5];
            z[0] = 1;
            z[1] = 2;
            z[2] = 3;
            z[3] = 4;
            z[4] = 5;

            z[5] = 6;//this will throw an ArrayIndexOutOfBoundsException


            System.out.println(c);
        } 
        
        catch (ArithmeticException e) {   
            System.out.println(e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    
    }
}
