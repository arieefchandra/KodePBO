package Jobsheet2.Tugas;
public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah data1 = new MataKuliah();
        data1.kodeMK = "MK001";
        data1.namaMK = "Pemrograman Berorientasi Objek";
        data1.sks = 3;
        data1.nilaiAngka = 4.0;
        data1.tampilData();
        System.out.println();

        MataKuliah data2 = new MataKuliah();
        data2.kodeMK = "MK002";
        data2.namaMK = "Matematika Numerik";
        data2.sks = 3;
        data2.nilaiAngka = 3.5;
        data2.tampilData();
        System.out.println();

        MataKuliah data3 = new MataKuliah();
        data3.kodeMK = "MK003";
        data3.namaMK = "Sistem Informasi Manajemen";
        data3.sks = 2;
        data3.nilaiAngka = 3.0;
        data3.tampilData();
        System.out.println();

        double totalBobot = data1.hitungBobotNilai() + data2.hitungBobotNilai() + data3.hitungBobotNilai();
        System.out.println("Total Bobot Nilai : " + totalBobot);
    }
}