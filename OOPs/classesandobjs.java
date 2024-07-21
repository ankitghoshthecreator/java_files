/**
 * classesandobjs
 */
class oops {
    String color;
    String type;

    public static void write() {
        System.out.println("Hello");
    }

    public void printColor() {
        System.out.println(this.color);// this keyword helps to kinow which object called it whis obj is trying to
                                       // access it
    }

}

/**
 * Student
 * 
 */
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class classesandobjs {
    public static void main(String[] args) {
        // oops car = new oops();
        // car.color = "black";
        // car.type = "sedan";
        // System.out.println(car.color);
        // System.out.println(car.type);
        // oops.write();
        // car.printColor();

        Student stdntinfo = new Student();// new keyword helps to allocate a place in the memory heap where the whole
                                          // obj will be stored

        stdntinfo.name = "sachin";
        stdntinfo.age = 20;
        stdntinfo.printInfo();

    }

}