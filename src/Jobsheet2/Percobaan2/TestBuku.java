package Jobsheet2.Percobaan2;
public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTerbit = 2021;
        buku1.tampilInfoBuku();

        Buku buku2 = new Buku();
        buku2.isbn = "978-623-01-0001-1";
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.penulis = "Budi Santoso";
        buku2.penerbit = "Andi Offset";
        buku2.tahunTerbit = 2022;
        buku2.tampilInfoBuku();

        Buku buku3 = new Buku();
        buku3.isbn = "978-623-01-0002-8";
        buku3.judul = "Pemrograman Java";
        buku3.penulis = "Citra Dewi";
        buku3.penerbit = "Informatika";
        buku3.tahunTerbit = 2023;
        buku3.tampilInfoBuku();

    }
}
