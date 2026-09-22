package Jobsheet4.Tugas;

public class Produk {
    private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

