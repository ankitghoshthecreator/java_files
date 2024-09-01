package classpractices;

public class Person {
 // Attributes of the Person class
 protected String name;
 protected int age;

 // Constructor to initialize name and age
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display the details of the person
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

class Student extends Person {
 // Additional attribute of the Student class
 private String studentId;

 // Constructor to initialize name, age, and studentId
 public Student(String name, int age, String studentId) {
     super(name, age); // Call the constructor of the base class (Person)
     this.studentId = studentId;
 }

 // Method to display the details of the student
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call the displayDetails method of the base class
     System.out.println("Student ID: " + studentId);
 }
}

public class Main {
 public static void main(String[] args) {
     // Create a Person object
     Person person = new Person("John Doe", 45);
     System.out.println("Person Details:");
     person.displayDetails();

     // Create a Student object
     Student student = new Student("Jane Smith", 20, "S12345");
     System.out.println("\nStudent Details:");
     student.displayDetails();
 }
}