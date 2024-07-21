public class anonymusobj {
    public static void main(String[] args) {
        // for printing the i we just need to create a obj as Inneranonymusobj a=new
        // Inneranonymusobj(); but in anonymus we can do

        /* anonymus objs are created once for use meaning use and throw */
        new InnerAnonymusObj().i = 5;
        new InnerAnonymusObj().show();// this will give output as 0 not 5 because the upper obj created is diff and
                                      // this one is diff
        /*
         * we neewd to use the anonymus obj only wen we know we are gonna use that obj
         * only once
         */

    }
}

/**
 * Inneranonymusobj
 */
class InnerAnonymusObj {
    int i;

    void show() {
        System.out.println(i);
    }

}
