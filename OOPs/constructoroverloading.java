public class constructoroverloading {
    public static void main(String[] args) {
        A obj = new A(8.3f);// i am passing a float value now commenting the float parameter
    }
}

class A {
    A() {
        System.out.println("Hello from default");
    }

    A(int i) {
        System.out.println("Hello from int param");
    }

    A(String i) {
        System.out.println("Hello from string param");
    }

    A(double i) { // so now the float will be converted as double it is called implicit conversion
        System.out.println("Hello from double param");
    }
    // A(float i){
    // System.out.println("Hello from float param");
    // }
}
/*
 * here it is constructor overloading when the constructor is called the the
 * suitable parameter will be called
 */
