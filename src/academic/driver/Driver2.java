// academic/driver/Driver1.java
package academic.driver;

/**
 * @author 12S24054 Rahel Juri Elisabet Silaban
 */

import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner; 

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan '---'
            }

            // Validasi input sederhana: pastikan memiliki 4 segmen
            String[] segments = line.split("#");
            if (segments.length == 4) {
                try {
                    String NIM = segments[0];
                    String name = segments[1];
                    String Angkatan = segments[2];
                    String Prodi = segments[3];

                    // Buat objek Student dan tambahkan ke ArrayList
                    Student student = new Student(NIM, name, Angkatan, Prodi);
                    students.add(student);
                } catch (NumberFormatException e) {
                    System.err.println("" + line);
                }
            } else {
                System.err.println("" + line);
            }
        }

        // Tampilkan semua Student yang tersimpan
        for (Student student : students) {
            System.out.println(student.toString());
        }

        input.close(); // Tutup scanner
    }
}
