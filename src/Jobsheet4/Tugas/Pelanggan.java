package Jobsheet4.Tugas;

public class Pelanggan {
    private String nama;
    private Alamat alamat;

    // AGGREGATION
    public Pelanggan(String nama, Alamat alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilInfo() {
        System.out.println("Nama pelanggan: " + nama);
        alamat.tampilAlamat();
    }

    // DEPENDENCY
    public void beliProduk(Produk produk) {
        System.out.println(nama + " membeli produk:");
        produk.tampilInfo();
    }
}
