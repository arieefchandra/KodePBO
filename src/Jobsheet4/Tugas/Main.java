package Jobsheet4.Tugas;

public class Main {
    public static void main(String[] args) {

        // Membuat objek Alamat dari luar Pelanggan
        Alamat alamat = new Alamat("Jl. Mawar No. 10", "Malang");

        // Membuat objek Pelanggan
        Pelanggan pelanggan = new Pelanggan("Alex", alamat);

        // Membuat objek Toko
        Toko toko = new Toko("Toko Online Jaya");

        System.out.println("=== DATA PELANGGAN ===");
        pelanggan.tampilInfo();

        System.out.println();

        System.out.println("=== DATA TOKO ===");
        toko.tampilProduk();

        System.out.println();

        System.out.println("=== PEMBELIAN ===");

        // Produk dibuat dari luar untuk Dependency
        Produk produk = new Produk("Mouse", 150000);

        pelanggan.beliProduk(produk);
    }
}

