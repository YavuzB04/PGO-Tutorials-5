import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentList.add(student);
    }
    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }
    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Index: " + student.getIndexNumber());
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Phone: " + student.getPhone());
            System.out.println("Birth Date: " + student.getBirthDate());
            System.out.println("Current Semester: " + student.getCurrentSemester());
            System.out.println("Status: " + student.getStatus());
            System.out.println();
        }
    }
}