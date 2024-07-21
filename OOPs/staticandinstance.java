public class staticandinstance {

    public static void main(String[] args) {

        Innerstaticandinstance obj = new Innerstaticandinstance(); // * we created a instance named obj to work with the
                                                                   // function
        obj.show();

        Innerstaticandinstance.hello();// we can just use the function with the classname.functionname()
    }
}

/**
 * Innerstaticandinstance
 */
class Innerstaticandinstance {
    int i = 10; // this i can be used in show block but not in hello block
    static int j = 5;// this can be used in both instance and static func block

    void show() {// here we created a instance function for calling this func *
        System.out.println("show instance function ");
        System.out.println(i + j);

    }

    static void hello() {// here in static function we don't need any instance variable
        System.out.println("hello static function");
        System.out.println(j);
    }

}
