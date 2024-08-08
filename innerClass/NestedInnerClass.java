package innerClass;

public class NestedInnerClass {
    
    public static void main(String[] args) {
        //for a class to be nested inner class is to make the class static
        //to access the member of the inner class we need to do
        A.B obj1=new A.B();
        
        obj1.show();

    }
}

class A{
    static class B{                              // for a class to be nested inner class is to make the class static 
        void show(){
            System.out.println("hello from static inner class");
        }

    }
}
