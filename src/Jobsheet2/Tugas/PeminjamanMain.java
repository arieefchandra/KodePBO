    package Jobsheet2.Tugas;

    public class PeminjamanMain {
        public static void main(String[] args) {
            Peminjaman data1 = new Peminjaman();
            data1.idTransaksi = "12345";
            data1.namaPeminjam = "Ika Nuril";
            data1.judulBuku = "PBO";
            data1.jumlahHariTerlambat= 0 ;
            data1.tampilkanData();
            System.out.println();
            
            Peminjaman data2 = new Peminjaman();
            data2.idTransaksi = "23456";
            data2.namaPeminjam = "Irsyad Haibatullah";
            data2.judulBuku = "Metnum";
            data2.jumlahHariTerlambat= 3 ;
            data2.tampilkanData();
            System.out.println();

            Peminjaman data3 = new Peminjaman();
            data3.idTransaksi = "34567";
            data3.namaPeminjam = "Samsul baihaqi";
            data3.judulBuku = "SIM";
            data3.jumlahHariTerlambat= 10 ;
            data3.tampilkanData();
            System.out.println();
        }
    }
