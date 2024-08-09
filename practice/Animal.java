package practice;

class Animilia {
    public void makeSound(){
        System.out.println("making sound");
    }
}

class cat extends Animilia {
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animilia a = new Animilia();
        a.makeSound();
        cat c = new cat();
        c.makeSound();
    }
}