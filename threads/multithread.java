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
        System.out.println("hello");
    }
}

class B{
    public void show() {
        System.out.println("hii");
    }
}