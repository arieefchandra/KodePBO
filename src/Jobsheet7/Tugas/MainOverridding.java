package Jobsheet7.Tugas;

public class MainOverridding {
    public static void main(String[] args) {

        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        System.out.println("=== Dosen ===");
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Mahasiswa ===");
        m2.bernafas();
        m2.makan();
    }
}
