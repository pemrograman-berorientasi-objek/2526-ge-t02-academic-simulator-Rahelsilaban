package academic.driver;
import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import java.util.ArrayList;
import java.util.List; // Menggunakan interface List untuk deklarasi
import java.util.Scanner;
/**
 * @author 12S24054 Rahel Juri Elisabet Silaban 
 */
public class Driver4 {

    public static void main(String[] _args) {

         Scanner input = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] segments = line.split("#");
            String command = segments[0];

            switch (command) {
                case "course-add":
                    if (segments.length == 5) {
                        String code = segments[1];
                        String name = segments[2];
                        int credits = Integer.parseInt(segments[3]);
                        String grade = segments[4]; // Di sini 'grade' bisa jadi 'section'
                        courses.add(new Course(code, name, credits, grade));
                    } else {
                        System.err.println("Error: Format 'course-add' tidak sesuai. Baris ini diabaikan: " + line);
                    }
                    break;
                case "student-add":
                    if (segments.length == 5) {
                        String id = segments[1];
                        String name = segments[2];
                        String academicYear = segments[3];
                        String major = segments[4];
                        students.add(new Student(id, name, academicYear, major));
                    } else {
                        System.err.println("Error: Format 'student-add' tidak sesuai. Baris ini diabaikan: " + line);
                    }
                    break;
                case "enrollment-add":
                    if (segments.length == 5) { // Command + 4 data = 5 segments
                        String courseCode = segments[1];
                        String studentId = segments[2];
                        String academicYear = segments[3];
                        String semester = segments[4];
                        enrollments.add(new Enrollment(courseCode, studentId, academicYear, semester));
                    } else {
                        System.err.println("Error: Format 'enrollment-add' tidak sesuai. Baris ini diabaikan: " + line);
                    }
                    break;
                default:
                    System.err.println("Error: Perintah tidak dikenal. Baris ini diabaikan: " + line);
                    break;
            }
        }

        // Output semua entitas sesuai urutan contoh: Course, Student, Enrollment
        for (Course course : courses) {
            System.out.println(course);
        }
        for (Student student : students) {
            System.out.println(student);
        }
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        input.close();
    }
}
