package practice;

public class Student {
    int studentId;
    String  studentName, grade;

    Student(){
        studentId= 0;
        studentName = "Unknown";
        grade = "none";
    }

    Student(int id, String name, String grade){
        this.studentId = id;
        this.studentName = name;
        this.grade = grade;
    }
    

    public static void main(String[] args) {
     Student s1=new Student();
     System.out.println(s1.studentId);
     System.out.println(s1.studentName);
     System.out.println(s1.grade);
     
     
     Student s2 = new Student(1, "Ankit", "A");
     System.out.println(s2.studentId);
     System.out.println(s2.studentName);
     System.out.println(s2.grade);
    }
}
