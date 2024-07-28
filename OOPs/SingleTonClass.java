public class SingleTonClass { // single ton class allows only one instance
    public static void main(String[] args) {
        A obj = A.getObj();
        obj.i = 8;
        obj.show();

    }
}

// single ton class
class A {
    int i;
    private static A obj = new A(); // step 2 create the obj in the same class to call this obj we need to define a
                                    // method

    private A() { // first step of singleton class is to make it private
    }

    public static A getObj() { // step 3 create a method to return the obj
        return obj; // return obj
    }

    public void show() {
        System.out.println("show fun " + i);
    }
}
