package innerClass;

/**
 * innerclass are of 3 types
 * member inner class
 * nested inner class
 * anonymous inner class
 */


 //this is member inner class
public class MemberInnerClass {

    public static void main(String[] args) {
        A obj=new A();//we can do like to create an object of A but what for B
        // so we need to do
        A.B obj1=obj.new B();
        //to access some member of the inner class we need to do
        obj1.show();

    }
}

class A{
    class B{
        void show(){
            System.out.println("hello");
        }

    }
}