public class constructor {
    public static void main(String[] args) {
        person a = new person();
        a.setInfo("sachin", 20);
        a.getInfo();

        person b = new person();
        b.setInfo("Ankit", 21);
        b.getInfo();
    }
}

class person {
    private String name;
    private int age;

    public void setInfo(String n, int a) {
        this.age = a;
        this.name = n;
    }

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public person() {
        System.out.println("contructor called");
    }
}