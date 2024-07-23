public class methodoverloading {// multiple method same name different parameters
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.show();
        obj.show(10);
        /*
         * due to parameter difference the first call will go to the function without
         * parameters
         */
    }
}

class ABC {
    public void show() {
        System.out.println("default show");
    }

    public void show(int i) {
        System.out.println(i);
    }
    /* function name same but parameter are diff so it dose not give error */

}
