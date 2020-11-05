package ehu.isad.model;

public class StudentsModel {

    private Integer studentID;
    private String firstName;
    private String lastName;

    public StudentsModel(Integer studentId, String firstName, String lastName) {
        this.studentID = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {this.studentID = studentID;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }
}