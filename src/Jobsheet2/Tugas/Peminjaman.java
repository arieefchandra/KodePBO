package Jobsheet2.Tugas;

public class Peminjaman {
    public  String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariTerlambat;
    public int denda;

    public void tampilkanData(){
        System.out.println("ID Transaksi            : " + idTransaksi);
        System.out.println("Nama Peminjam           : " + namaPeminjam);
        System.out.println("Judul Buku              : " + judulBuku);
        System.out.println("Jumlah Hari Terlambat   : " + jumlahHariTerlambat);
        System.out.println("Denda                   : " + denda);
    }

    public int hitungDenda(){
        denda = jumlahHariTerlambat * 10000;
        return denda;
    }
}
