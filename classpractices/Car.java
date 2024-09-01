package classpractices;

public class Car extends Vehicle {
    private int numDoors;

    // Constructor to initialize make, model, and numDoors
    public Car(String make, String model, int numDoors) {
        super(make, model); // Call the constructor of the base class (Vehicle)
        this.numDoors = numDoors;
    }

    // Override the display method to include numDoors
    @Override
    public void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Number of Doors: " + numDoors);
    }
}