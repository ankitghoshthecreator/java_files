package practice;

public class Cat {

    public static void main(String[] args) {
        Cat1 c1=new Cat1();


        c1.displayName();
        
    }
}

class Cat1{
    
    private String name;
    private int age;


    Cat1(){
        this.age=0;
        this.name="unknown";
    }

    void displayName(){
        System.out.println(name);
        System.out.println(age);
    }

}
