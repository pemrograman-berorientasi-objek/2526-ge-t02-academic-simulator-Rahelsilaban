/**
 * @author 12S24054 Rahel Juri Elisabet Silaban
 */
    package academic.model;

public class Enrollment {
    private String courseCode;
    private String studentId;
    private String academicYear;
    private String semester;
    private String grade; // Default value is "None" as per requirement

    public Enrollment(String courseCode, String studentId, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // Set default grade
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    // You might add a setter for grade if it can be updated later
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return courseCode + "|" + studentId + "|" + academicYear + "|" + semester + "|" + grade;
    }
}

