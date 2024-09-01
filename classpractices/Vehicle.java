package classpractices;

public class Vehicle {
    protected String make;
    protected String model;

    // Constructor to initialize make and model
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display make and model
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}