package threads;

public class multithread {
  
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.show();
        obj2.show();
    }


}

class A{
    public void show() {
        for(int i=1;i<5;i++) {
            System.out.println("hello");
        }
        
    }
}

class B{
    public void show() {
        for(int i=1;i<5;i++) {
            System.out.println("hii");
        }
        
    }
        
}
/* my aim is to print the hii and hello parallely simultaneously but in this code i am not able to do that
 * becoz i at first created the instance of class A and then B and then i called the functions
 * so i am not able to print the hii and hello parallely
 *  the function in class B will be called only after the function in class A is called
 * so for the solution of this we can use threads concept in java
 * where we can create the thread by using runnable interface
 * and do different things in the same time by using thread class
 */
    


