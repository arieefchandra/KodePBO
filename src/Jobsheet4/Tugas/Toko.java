package Jobsheet4.Tugas;

public class Toko {
    private String nama;
    private Produk produk;

    // COMPOSITION
    public Toko(String nama) {
        this.nama = nama;
        this.produk = new Produk("Laptop", 7500000);
    }

    public void tampilProduk() {
        System.out.println("Toko: " + nama);
        System.out.println("Daftar produk:");
        produk.tampilInfo();
    }
}

