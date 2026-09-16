package Jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer( "REQ-9988", "PT. Maju Bersama",5000
        );

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin dimasukkan: ");
        int tambah = sc.nextInt();
        kontainerAlfa.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan: ");
        int turun = sc.nextInt();
        kontainerAlfa.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        sc.close();
    }
}