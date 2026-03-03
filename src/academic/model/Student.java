package academic.model;

/**
 * @author 12S24054 Rahel Juri Elisabet Silabansw
 */

public class Student {
    private String NIM;
    private String name;
    private String Angkatan;
    private String Prodi;

    public Student(String NIM, String name, String Angkatan, String Prodi) {
        this.NIM = NIM;
        this.name = name;
        this.Angkatan = Angkatan;
        this.Prodi = Prodi;
    }

    public String getnim() {
        return NIM;
    }

    public String getName() {
        return name;
    }

    public String getangkatan() {
        return Angkatan;
    }

    public String getprodi() {
        return Prodi;
    }

    @Override
    public String toString() {
        return NIM + "|" + name + "|" + Angkatan + "|" + Prodi;
    }
}