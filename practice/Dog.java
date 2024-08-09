package practice;

public class Dog {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1("Tommy", "brown");
        String[] details = d1.getName();
        System.out.println("Name: " + details[0] + ", Color: " + details[1]);
        
    }
}

class Dog1{

    private String name;
    private String color;

    public Dog1(String n, String c) {
        this.name = n;
        this.color = c;
    }

    public String[] getName() {
        return new String[] {name, color};
    }
}
