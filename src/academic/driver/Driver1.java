// academic/driver/Driver1.java
package academic.driver;

/**
 * @author 12S24054 Rahel juri Elisabet Silaban
 */

import academic.model.Course;
import java.util.ArrayList;
import java.util.Scanner; // Menggunakan ArrayList karena ukuran array dinamis lebih mudah

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan '---'
            }

            // Validasi input sederhana: pastikan memiliki 4 segmen
            String[] segments = line.split("#");
            if (segments.length == 4) {
                try {
                    String code = segments[0];
                    String name = segments[1];
                    int credits = Integer.parseInt(segments[2]); // Konversi SKS ke integer
                    String grade = segments[3];

                    // Buat objek Course dan tambahkan ke ArrayList
                    Course course = new Course(code, name, credits, grade);
                    courses.add(course);
                } catch (NumberFormatException e) {
                    System.err.println("Error: SKS harus berupa angka. Baris ini diabaikan: " + line);
                }
            } else {
                System.err.println("Error: Format input tidak sesuai (harus 4 segmen dipisah '#'). Baris ini diabaikan: " + line);
            }
        }

        // Tampilkan semua courses yang tersimpan
        for (Course course : courses) {
            System.out.println(course.toString());
        }

        input.close(); // Tutup scanner
    }
}
