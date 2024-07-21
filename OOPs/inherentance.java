class Add { // parent or base or super class
    int i, j, k;

    public void setValues(int a, int b) {
        i = a;
        j = b;
    }

    public void add() {
        k = i + j;
    }

    public void showResult() {
        System.out.println(k);
    }
}

class Sub extends Add { // child or derived or sub class
    // int i, j, k;

    // public void setValues(int a, int b){
    // i=a;
    // j=b;
    // }
    public void sub() {
        k = i - j;
    }
    // public void showResult(){
    // System.out.println(k);
    // }

}

class Mul extends Sub {// this is called multilevel inheritance where mul inherit sub and sub inherit
                       // add
    public void mul() {
        k = i * j;
    }
}

public class inherentance {
    public static void main(String[] args) {
        Add in = new Add();
        in.setValues(10, 8);
        in.add();
        in.showResult();

        Sub substract = new Sub();
        substract.setValues(10, 8);
        substract.sub();
        substract.showResult();

        Mul multi = new Mul();
        multi.setValues(10, 8);
        multi.mul();
        multi.showResult();

    }
}
