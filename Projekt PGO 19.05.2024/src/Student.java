import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int nextIndexNumber = 1;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private Date birthDate;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private List<Grade> grades;
    private String status;

    public Student(String firstName, String lastName, String email, String address, String phone, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.indexNumber = "s" + nextIndexNumber++;
        this.grades = new ArrayList<>();
        this.status = "Candidate";
    }

    public String getIndexNumber() {
        return indexNumber;
    }
    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.currentSemester = 1;
        this.status = "Student";
    }
    public void addGrade(int value, String subject) {
        grades.add(new Grade(value, subject));
    }
    public int countITNs() {
        int itnCount = 0;
        for (Grade grade : grades) {
            if (grade.getValue() < 3) {
                itnCount++;
            }
        }
        return itnCount;
    }
    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters() && countITNs() <= studyProgramme.getMaxAllowedITNs()) {
            currentSemester++;
        }
        if (currentSemester == studyProgramme.getNumberOfSemesters()) {
            status = "Graduate";
        }
    }
    public int getCurrentSemester() {
        return currentSemester;
    }
    public String getStatus() {
        return status;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public Date getBirthDate() {
        return birthDate;
    }
}
