package classpractices;

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Camry");
        System.out.println("Vehicle Details:");
        vehicle.display();

        // Create a Car object
        Car car = new Car("Honda", "Civic", 4);
        System.out.println("\nCar Details:");
        car.display();
    }
}