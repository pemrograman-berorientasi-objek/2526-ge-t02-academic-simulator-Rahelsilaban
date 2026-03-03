package academic.driver;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author 12S24054 Rahel juri Elisabet Silaban
 */
public class Driver3 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan '---'
            }

            // Validasi input sederhana: pastikan memiliki 4 segmen
            String[] segments = line.split("#");
            if (segments.length == 4) {
                String courseCode = segments[0];
                String studentId = segments[1];
                String academicYear = segments[2];
                String semester = segments[3];

                // Buat objek Enrollment dan tambahkan ke ArrayList
                Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollments.add(enrollment);
            } else {
                System.err.println("Error: Format input tidak sesuai (harus 4 segmen dipisah '#'). Baris ini diabaikan: " + line);
            }
        }

        // Tampilkan semua enrollments yang tersimpan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }

        input.close(); // Tutup scanner
    }
}