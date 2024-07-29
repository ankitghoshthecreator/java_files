package abstruct;

public class abstruction {

    public static void main(String[] args) {
        X obj = new Y();// obj of class X but the insatanciation is of class y (the sub class)
        obj.show();
    }
}

abstract class X {
    public void show() {
        System.out.println("hello from normal method");
    }

    public abstract void hello(); // abstruct class is a class where we declare the function only dosent write the
                                  // body

    public abstract void hii();
}

class Y extends X {
    public void hello() {
        System.out.println("hello");
    }

    public void hii() {
        System.out.println("hii");
    }// if we have a abstruct function in parent class we have to implement it in the
     // sub class or it will give error

}