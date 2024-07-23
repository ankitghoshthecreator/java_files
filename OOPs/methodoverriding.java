public class methodoverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

class A {
    void show() {
        System.out.println("hello from A");
    }

}

class B extends A {

    void show() {
        System.out.println("hello from B");
    }
}
/*
 * here when we have a function in class A and class B with same name but the
 * out put will be hello from B because of the overridden method
 * it dose not need to go tho upper hirarcy it checks in class b that a function
 * with name show is present or not if is there then it will run
 * if not present it will go to upper hirarcy
 * as present here it runs the class b show func
 */
