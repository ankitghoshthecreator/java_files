public class encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        // if in the student class private key word is not used we can simply do like
        // this
        s1.name = "Ankit";
        // as private is used so we need to use methods
        s1.setAge(20);

        System.out.println(s1.name);
        System.out.println(s1.getage());

    }
}

class Student {

    String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getage() {
        return age;
    }

    

}
