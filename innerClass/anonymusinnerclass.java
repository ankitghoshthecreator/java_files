package innerClass;

public class anonymusinnerclass {
    public static void main(String[] args) {
        Z obj = new Z() {
            // This is an anonymous inner class
            @Override
            public void show() {
                System.out.println("hello world");
            }
        };
        obj.show(); // This should now print "hello world"
    }
}

class Z {
    public void show() {
        System.out.println("hello");
    }
}
