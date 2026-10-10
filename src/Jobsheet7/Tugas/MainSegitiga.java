package Jobsheet7.Tugas;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total sudut A = "
                + s.totalSudut(60));

        System.out.println("Total sudut A dan B = "
                + s.totalSudut(60, 70));

        System.out.println("Keliling segitiga = "
                + s.keliling(3, 4, 5));

        System.out.println("Panjang sisi miring = "
                + s.keliling(3, 4));
    }
}
